package com.malachitebe.controllers;

import java.io.StringReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.malachitebe.entities.entreprises;
import com.malachitebe.entities.identites;
import com.malachitebe.interfaces.iadherent;
import com.malachitebe.interfaces.ientreprises;
import com.malachitebe.interfaces.iidentites;
import com.malachitebe.models.adherentModel;
import com.malachitebe.models.form_adherentModel;
import com.malachitebe.services.imageService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/adherent")
public class adherentController {
	@Autowired
	iadherent iadherent;
	@Autowired
	iidentites iidentites;
	@Autowired
	ientreprises ientreprises;
	@Autowired
	imageService imageService;
	@GetMapping("/GetAdherentDetail/{id}")
	public adherentModel GetAdherentDetail(@PathVariable("id") Long id){
		return iadherent.GetAdherentDetail(id);
	}
	@GetMapping("/getReportetatmensuel/{idpays}/{idprovince}/{idville}/{idcommune}/{idadherent}/{mois}/{annee}")
	public ResponseEntity<?> getReportetatmensuel(@PathVariable("idpays") String[] idpays,@PathVariable("idprovince") String[] idprovince,@PathVariable("idville") String[] idville,
			@PathVariable("idcommune") String[] idcommune,@PathVariable("idadherent") String[] idadherent,@PathVariable("mois") Integer mois,@PathVariable("annee") Integer annee){
	
		return iadherent.getReportetatmensuel(idpays,idprovince,idville,idcommune,idadherent,mois,annee);
	}
	
	@GetMapping("/GetAdherent/{search}/{page}/{size}")
	public Page<adherentModel> GetAdherent(@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return iadherent.GetAdherent(search,PageRequest.of(page, size));
	}
	
	/*@GetMapping("/GetCotisations/{Query}/{mois}/{Annee}/{page}/{size}")
	public Page<adherentModel> GetCotisations(@PathVariable("Query") Integer Query,@PathVariable("mois") Integer mois,@PathVariable("Annee") Integer Annee,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return iadherent.GetCotisations(Query,mois,Annee,PageRequest.of(page, size));
	}*/
	@GetMapping("/GetSuspensionAdherent/{Query}/{idcommune}/{search}/{page}/{size}")
	public Page<adherentModel> GetSuspensionAdherent(@PathVariable("Query") Integer Query,@PathVariable("idcommune") Integer idcommune,@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return iadherent.GetSuspensionAdherent(Query,idcommune,search,PageRequest.of(page, size));
	}
	@PostMapping("/SaveAdherent/{dossier}")
	public ResponseEntity<?> SaveAdherent(@RequestParam("file")MultipartFile file,@RequestParam("adherent")String adherent,@PathVariable("dossier")String dossier )
			throws JsonMappingException, JsonProcessingException{
		String noQuote=adherent.replaceAll("^\"|\"$", "").replace("\\", "");
		System.out.println(noQuote);
		System.out.println("file : "+file);
		System.out.println("dossier : "+dossier);
		System.out.println("a1");
		Gson g=new Gson();
		JsonReader reader = new JsonReader(new StringReader(noQuote));
        reader.setLenient(true);
		form_adherentModel adh=g.fromJson(reader,form_adherentModel.class);
		adh.setPhoto(imageService.uploadToLocalFileSystem(file, dossier).getBody().toString());
		System.out.println("a2");
		if(iidentites.save(adh)) {
			System.out.println("a3");
			return ResponseEntity.ok().body(adh);
        }else {
	      return ResponseEntity.ok().body("Enregistrement échoué!!" );
        }
	}
	@GetMapping("/collectionsentreprise")
	public List<entreprises> collectionsentreprise(){
	
		return ientreprises.collectionsentreprise();
	}
	@GetMapping("/Getadherentetatmensuel/{mois}/{Annee}/{idcommune}/{search}/{page}/{size}")
	public Page<adherentModel> Getadherentetatmensuel(@PathVariable("mois") Integer mois,@PathVariable("Annee") Integer Annee,@PathVariable("idcommune") Integer idcommune,@PathVariable("search") String search,@PathVariable("page")Integer page,@PathVariable("size") Integer size){
		return iadherent.Getadherentetatmensuel(mois,Annee,idcommune,search,PageRequest.of(page, size));
	}
	@GetMapping("/getReportdroitprestation/{query}/{idpays}/{idprovince}/{idville}/{idcommune}/{idadherent}")
	public ResponseEntity<?> getReportdroitprestation(@PathVariable("query")Integer query, @PathVariable("idpays") String[] idpays,@PathVariable("idprovince") String[] idprovince,@PathVariable("idville") String[] idville,
			@PathVariable("idcommune") String[] idcommune,@PathVariable("idadherent") String[] idadherent){
		return iadherent.getReportdroitprestation(query,idpays,idprovince,idville,idcommune,idadherent);
	}
}
