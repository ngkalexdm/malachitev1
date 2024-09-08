package com.malachitebe.services;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.malachitebe.entities.adherent;
import com.malachitebe.interfaces.iadherent;
import com.malachitebe.interfaces.iarriere_avance;
import com.malachitebe.interfaces.ibeneficiaires;
import com.malachitebe.interfaces.icotisation_emise;
import com.malachitebe.interfaces.icotisation_percue;
import com.malachitebe.interfaces.iexercice;
import com.malachitebe.interfaces.igarantie;
import com.malachitebe.interfaces.imouvement_adherent;
import com.malachitebe.interfaces.iprestataires;
import com.malachitebe.interfaces.isituation_compte;
import com.malachitebe.models.adherentModel;
import com.malachitebe.models.form_adherentModel;
import com.malachitebe.models.garantie_santesModels;
import com.malachitebe.models.reportBase64;
import com.malachitebe.repositories.adherentRepository;
import com.malachitebe.interfaces.ipac;
@Service
public class adherentService implements iadherent {
@Autowired
JdbcTemplate jdbcTemplate;
@Autowired
iprestataires iprestataires;
@Autowired
imouvement_adherent imouvement_adherent;
@Autowired
icotisation_emise icotisation_emise;
@Autowired
icotisation_percue icotisation_percue;
@Autowired
iarriere_avance iarriere_avance;
@Autowired
igarantie igarantie;
@Autowired
iexercice iexercice;
@Autowired
adherentRepository adherentRepository;
@Autowired
ipac ipac;
@Autowired
isituation_compte isituation_compte;
@Autowired
ibeneficiaires ibeneficiaires;
	@Override
	public adherentModel GetAdherentDetail(Long id) {
		adherentModel collection= new adherentModel();
		String query="";
		try {
			query="select a.id as id_adherent,a.identite,i.adresse,a.code_mutuelle,i.nom,i.prenom,i.sexe,i.naissance,i.lieu_naissance, "
					+ "i.profession,i.telephone_fixe,case when i.telephone_portable='' then i.telephone_fixe else i.telephone_portable end telephone_portable,a.situation_actuelle,s.intitule_situation,a.salaire, "
					+ "i.photo,i.id,i.responsable,i.contactresponsable as contact,a.id_garantie,g.nom as nom_garentie,g.droit_adhesion,"
					+ "i.email,i.adresse,g.id_type_cotisation,tc.type_cotisation "
					+ "from Tab_adherent a "
					+ "inner join Tab_garantie  g on a.id_garantie=g.id_garantie "
					+ "inner join Tab_situation_adherents s on a.situation_actuelle=s.id "
					+ "inner join Tab_type_cotisation tc on tc.id=g.id_type_cotisation "
					+ "inner join Tab_identites i on a.identite=i.id "
					+ "where a.id="+id ;
			collection=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(adherentModel.class));
			collection.setCotisation_mensuel(igarantie.GetGarantie(collection.getId_garantie()).getCotisation_mensuel());
			collection.setPrestataires(iprestataires.GetGarantiePrestataire(collection.getId_garantie()));
			collection.setMouvement(imouvement_adherent.GetMouvement(collection.getId_adherent()));
			collection.setPac(ibeneficiaires.GetPacAdherent(collection.getId_adherent()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			System.out.println("ett : "+collection.getId_adherent());
			if(collection.getId_adherent()==null) {
				query="select a.id as id_adherent,a.identite,i.adresse,a.code_mutuelle,i.nom,i.prenom,i.sexe,i.naissance,i.lieu_naissance, "
						+ "i.profession,i.telephone_fixe,case when i.telephone_portable='' then i.telephone_fixe else i.telephone_portable end telephone_portable,a.situation_actuelle,s.intitule_situation,a.salaire, "
						+ "i.photo,i.id,i.responsable,i.contactresponsable as contact,a.id_garantie,g.nom as nom_garentie,g.droit_adhesion,"
						+ "i.email,i.adresse,g.id_type_cotisation,tc.type_cotisation "
						+ "from Tab_adherent a "
						+ "inner join Tab_garantie  g on a.id_garantie=g.id_garantie "
						+ "inner join Tab_situation_adherents s on a.situation_actuelle=s.id "
						+ "inner join Tab_type_cotisation tc on tc.id=g.id_type_cotisation "
						+ "inner join Tab_identites i on a.identite=i.id "
						+ "where i.id="+id ;
				collection=jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(adherentModel.class));
				collection.setCotisation_mensuel(igarantie.GetGarantie(collection.getId_garantie()).getCotisation_mensuel());
				collection.setPrestataires(iprestataires.GetGarantiePrestataire(collection.getId_garantie()));
				collection.setMouvement(imouvement_adherent.GetMouvement(collection.getId_adherent()));
				collection.setPac(ibeneficiaires.GetPacAdherent(collection.getId_adherent()));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(collection);
		return collection;
	}
	
	@Override
	public Page<adherentModel> GetAdherent(String search, Pageable pageable) {
		System.out.println("result : " +search);
		String nombre="SELECT COUNT(*)"
				+ "from Tab_adherent a "
				+ "inner join Tab_identites i on a.identite=i.id "
				+ "inner join Tab_garantie g on g.id_garantie=a.id_garantie ";
	    if (!search.equals("0")) {
	    	nombre=nombre+" where a.code_mutuelle like'%"+search+"%' or i.nom like'%"+search+"%' or i.profession like'%"+search+"%' or i.telephone_portable like'%"+search+"%' or i.sexe like'%"+search+"%' ";
	} 
		Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
    String query="with QUERY AS("
			+"SELECT a.id as id_adherent,a.code_mutuelle,i.nom,i.prenom,i.sexe,i.naissance, "
			+ "i.profession,i.adresse,i.telephone_fixe,i.telephone_portable,i.email,a.situation_actuelle, "
			+ "i.photo,a.id_garantie,g.nom as nom_garentie,i.id_categorie, "
			+"ROW_NUMBER() OVER(ORDER BY a.id DESC) as line "
			+ "from Tab_adherent a  "
			+ "	inner join Tab_identites i on a.identite=i.id "
			+ "	inner join Tab_garantie g on g.id_garantie=a.id_garantie ";
    if (!search.equals("0")) {
    query=query+" where a.code_mutuelle like'%"+search+"%' or i.nom like'%"+search+"%' or i.profession like'%"+search+"%' or i.telephone_portable like'%"+search+"%' or i.sexe like'%"+search+"%' ";
} 
query=query+") SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();

List<adherentModel> collections = jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(adherentModel.class));
return new PageImpl<adherentModel>(collections,pageable,count);
	}
	
	/*@Override
	public Page<adherentModel> GetCotisations(Integer Query, Integer mois, Integer Annee, Pageable pageable) {
 String query="with QUERY AS("
				+"SELECT a.id as id_adherent,a.code_mutuelle,i.nom,i.prenom,i.sexe,i.naissance, "
				+ "i.profession,i.adresse,i.telephone_fixe,i.telephone_portable,i.email,a.situation_actuelle, "
				+ "i.photo,i.id_categorie, "
				+"ROW_NUMBER() OVER(ORDER BY a.id DESC) as line "
				+ "from Tab_adherent a  "
				+ "	inner join Tab_identites i on a.identite=i.id ";
	query=query+") SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();

	List<adherentModel> collections = jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(adherentModel.class));
	String nombre="SELECT COUNT(*)"
			+ "from Tab_adherent a  "
			+ "inner join Tab_identites i on a.identite=i.id ";

	Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
   
	for (adherentModel adherent : collections) {
		if(Query==1) {
		adherent.setMontant_emise(icotisation_emise.MontantCotisationemise(adherent.getId_adherent()));
		
		 Double ArriereAvance = iarriere_avance._MontantArrieres(1,adherent.getId_adherent(), mois, Annee);
         adherent.setSituation_compte( isituation_compte.SituationCompte(adherent.getId_adherent()));

        adherent.setMontant_arriere( ArriereAvance < 0 ? -(ArriereAvance + adherent.getMontant_emise()) : ArriereAvance == 0 || ArriereAvance >=  adherent.getMontant_emise() ? 0 :  adherent.getMontant_emise() - ArriereAvance);
         
         adherent.setMontant_total( ArriereAvance == 0 ? 0 : adherent.getMontant_arriere() + adherent.getMontant_emise());
         adherent.setSuspendu(adherent.getSituation_actuelle() == 3 ? true : false);
		}else {
			adherent.setMontant_emise(icotisation_emise.MontantCotisationemise(adherent.getId_adherent()));
			Double ArriereAvance = iarriere_avance._MontantArrieres(2,adherent.getId_adherent(), mois, Annee);
              adherent.setMontant_arriere( ArriereAvance < 0 ? -(ArriereAvance + adherent.getMontant_emise()) : ArriereAvance == 0 || ArriereAvance >= adherent.getMontant_emise() ? 0 : adherent.getMontant_emise() - ArriereAvance);
              
            adherent.setMontant_percue(icotisation_percue.MontantPercues(adherent.getId_adherent(), mois, Annee));
		}
	}
		return new PageImpl<adherentModel>(collections,pageable,count);
	}*/
	

	@Override
	public Page<adherentModel> GetSuspensionAdherent(Integer query,Integer idcommune, String search, Pageable pageable) {
		  Calendar calendar = Calendar.getInstance();
		
		String nombre="SELECT COUNT(*)"
				+ "from  Tab_adherent a "
				+ "inner join Tab_identites i on i.id=a.identite ";
		if(query==1) {
			nombre=nombre+" where a.situation_actuelle=3 and i.id_commune="+idcommune;
		}else {
			nombre=nombre+" where a.situation_actuelle=2 and i.id_commune="+idcommune;
		}
	    if (!search.equals("0")) {
	    	nombre=nombre+" and (a.code_mutuelle like'%"+search+"%' or i.nom like'%"+search+"%' or i.profession like'%"+search+"%' or i.telephone_portable like'%"+search+"%' or i.sexe like'%"+search+"%')";
	} 
		Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
    String querry="with QUERY AS("
			+"SELECT a.id as id_adherent,a.code_mutuelle,i.nom,i.prenom,i.sexe,i.naissance, "
			+ "i.profession,i.adresse,i.telephone_fixe,i.telephone_portable,i.email,a.situation_actuelle, "
			+ "i.photo,a.id_garantie,i.id_categorie,i.date_creation, "
			+"ROW_NUMBER() OVER(ORDER BY a.id DESC) as line "
			+ "from Tab_adherent a  "
			+ "	inner join Tab_identites i on a.identite=i.id ";
    if(query==1) {
    	querry=querry+"where a.situation_actuelle=3 and i.id_commune="+idcommune;
	}else {
		querry=querry+"where a.situation_actuelle=2 and i.id_commune="+idcommune;
	}
    if (!search.equals("0")) {
    	querry=querry+" and (a.code_mutuelle like'%"+search+"%' or i.nom like'%"+search+"%' or i.profession like'%"+search+"%' or i.telephone_portable like'%"+search+"%' or i.sexe like'%"+search+"%')";
} 
    querry=querry+") SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();

List<adherentModel> collections = jdbcTemplate.query(querry,BeanPropertyRowMapper.newInstance(adherentModel.class));
for (adherentModel adherent : collections) {
if (query == 1)
{

    adherent.setMontant_arriere( -iarriere_avance.MontantArrieres(1, adherent.getId_adherent(), null));
    adherent.setEquivalent_mois(String.valueOf(Math.round(adherent.getMontant_arriere() / icotisation_emise.MontantCotisationemise(adherent.getId_adherent()))));
    adherent.setType_suspension(query == 1 ? "automatique" : " ");
}
else
{SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
String formattedDate = outputFormat.format(adherent.getDate_creation());
LocalDate date = LocalDate.parse(formattedDate);
    int m = date.getMonthValue();
    garantie_santesModels garantie = igarantie.GetGarantie(adherent.getId_garantie());
    Integer mois =(calendar.get(Calendar.MONTH)+1)- m;
    Integer observation = garantie == null ? 0 : garantie.getObservation();
    Integer calcul = mois - observation;
    adherent.setEquivalent_mois(String.valueOf(calcul == 0 ? 1 : calcul));
}
}
return new PageImpl<adherentModel>(collections,pageable,count);
	
	}

	@Override
	public Boolean SaveAdherent(form_adherentModel model) {
		Boolean reponse=false;
		LocalDate date = LocalDate.now();
		String _annee = date.getYear()+"";
		model.setId_adherent(model.getId_adherent()==null?0:model.getId_adherent());
		System.out.println("service 2");
		System.out.println(model.toString());
		System.out.println(model.getId_adherent());
		if(model.getId_adherent()==0) {
			if(model.getCode_parente()==null || model.getCode_parente()==0 || model.getCode_parente().toString()=="") {
				model.setCode_parente(0L);;
			}
			System.out.println("service 3");
			adherent a=new adherent();
			a.setBeneficiaire(model.getBeneficiaire());
			a.setIdentite(model.getIdentite());
			
			System.out.println("code parent : "+model.getCode_parente());
			System.out.println(model.getCode_parente() + "/A" + date.getDayOfMonth() + "/" + date.getMonthValue() + _annee.substring(2) + "-" + 0);
			a.setCode_mutuelle(NumeroAdherent(model.getCode_parente()) + "/A" + date.getDayOfMonth() + "/" + date.getMonthValue() + _annee.substring(2) + "-" + 0);
			//a.setId_zone(model.getId_zone());
            a.setId_garantie(model.getId_garantie());
            a.setBeneficiaire(model.getBeneficiaire());
            a.setSalaire(model.getSalaire()==null?0:model.getSalaire());
            a.setSituation_actuelle(model.getSituation_actuelle());
            System.out.println("service 3 1");
            a=adherentRepository.save(a);
            System.out.println(a.toString());
            if(a!=null) {
            	System.out.println("service 5");
            	model.setId_adherent(a.getId());
            	model.setCode_mutuelle(a.getCode_mutuelle());
            	if(model.getBeneficiaire()) {
            		System.out.println("service 6");
            		reponse=ibeneficiaires.AddBeneficiaire(model);
            	}
            }
		}else {
			System.out.println("service 4");
			 String[] CodeMutuelle = model.getCode_mutuelle().split("-");
             model.setCode_mutuelle(CodeMutuelle[0] + "-" + NumeroAdherent(model.getId_adherent()));
             reponse =ibeneficiaires.AddBeneficiaire(model);
		}
		
		return reponse;
	}
	 public String NumeroAdherent(Long idadherent)
     {
         Long CodeAdherent = (long) 0;
         String query="";
         if (idadherent == 0) // Bénéficiaire
         { 
        	 System.out.println("service 31");
        	 query="SELECT TOP (1) p.id FROM Tab_adherent p order by p.id desc";
        	 try {
                 CodeAdherent = jdbcTemplate.queryForObject(query,Long.class);
				} catch (Exception e) {
					CodeAdherent = (long) 0;
				}
             System.out.println("service 31 : "+CodeAdherent);
             CodeAdherent = CodeAdherent==null? 1: CodeAdherent==0L? 1: CodeAdherent+1;
             System.out.println("service 311 : "+CodeAdherent);
         }
         else // Personne à charge
         {
        	 System.out.println("service 32");
        	 query="select count(b.id_adherent) from Tab_Beneficiaires b Where b.id_adherent = "+idadherent;
        	 try {
                 CodeAdherent = jdbcTemplate.queryForObject(query,Long.class);
				} catch (Exception e) {
					CodeAdherent = (long) 0;
				}
            CodeAdherent = CodeAdherent==null? 1:CodeAdherent==0L? 1: CodeAdherent+1;
         }         

         String Code =  CodeAdherent.toString();
         System.out.println("NumeroAdh : "+Code);
         return Code;
     }

	@Override
	public Page<adherentModel> Getadherentetatmensuel( Integer mois, Integer Annee, Integer idcommune,String search,Pageable pageable) {
		String nombre="SELECT count(DISTINCT i.id) "
				+ "FROM Tab_identites i   "
				+ "inner join Tab_adherent a on a.identite=i.id  "
				+ "inner join Tab_cotisation_emise e on a.id=e.id_adherent "
				+ "inner join Tab_cotisation_percue r on a.id=r.id_adherent "
				+ "inner join Tab_arriere_avance b on a.id=b.id_adherent "
				+ "inner join Tab_exercice x on x.id=r.id_exercice and x.id=b.id_exercice "
				+ "where x.annees="+Annee+" and i.id_commune="+idcommune;
				if (!search.equals("0")) {
					nombre=nombre+" and (a.code_mutuelle like'%"+search+"%' or i.nom like'%"+search+"%' or i.prenom like'%"+search+"%' or i.sexe like'%"+search+"%')";
				} 
		Integer count = jdbcTemplate.queryForObject(nombre,Integer.class);
    
		String query="with QUERY AS("
				+"SELECT a.code_mutuelle,a.id as id_adherent, i.id as identite,i.nom,i.prenom,i.sexe, "
				+ "sum(r.mois_"+mois+") as montant_percue,sum(e.mois_"+mois+") as montant_emise,sum(b.mois_"+mois+") as montant_arriere, "
				+"ROW_NUMBER() OVER(ORDER BY i.id DESC) as line  "
				+ "FROM Tab_identites i   "
				+ "inner join Tab_adherent a on a.identite=i.id  "
				+ "inner join Tab_cotisation_emise e on a.id=e.id_adherent "
				+ "inner join Tab_cotisation_percue r on a.id=r.id_adherent "
				+ "inner join Tab_arriere_avance b on a.id=b.id_adherent "
				+ "inner join Tab_exercice x on x.id=r.id_exercice and x.id=b.id_exercice "
				+ "where x.annees="+Annee+" and i.id_commune="+idcommune;
				if (!search.equals("0")) {
					query=query+" and (a.code_mutuelle like'%"+search+"%' or i.nom like'%"+search+"%' or i.prenom like'%"+search+"%' or i.sexe like'%"+search+"%')";
				} 
				query=query+" group by a.code_mutuelle,a.id,i.id,i.nom,i.prenom,i.sexe) SELECT TOP " + pageable.getPageSize()+" * FROM QUERY WHERE LINE > (" + pageable.getPageNumber() + ") *" + pageable.getPageSize();

		List<adherentModel> collection=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(adherentModel.class));
		return new PageImpl<adherentModel>(collection,pageable,count);
	}

	@Override
	public ResponseEntity<?> getReportetatmensuel(String[] idpays,String[] idprovince, String[] idville, String[] idcommune,String[] idadherent,Integer mois,Integer annee) {
		String query="SELECT a.code_mutuelle,a.id as id_adherent, i.id as identite,i.nom,i.prenom,i.sexe,i.telephone_portable,i.email, "
				+ " sum(r.mois_"+mois+") as montant_percue,sum(e.mois_"+mois+") as montant_emise,sum(b.mois_"+mois+") as montant_arriere, "
				+ " c.id as id_commune,c.commune,v.id as id_ville,v.ville,pr.id as id_province,pr.province,p.id as id_pays,p.pays "
				+ " FROM Tab_identites i "
				+ " inner join Tab_adherent a on a.identite=i.id "
				+ " inner join Tab_cotisation_emise e on a.id=e.id_adherent "
				+ " inner join Tab_cotisation_percue r on a.id=r.id_adherent "
				+ " inner join Tab_arriere_avance b on a.id=b.id_adherent "
				+ " inner join Tab_exercice x on x.id=r.id_exercice and x.id=b.id_exercice "
				+ " inner join Tab_communes c on c.id=i.id_commune "
				+ " inner join Tab_ville v on v.id=c.code_ville"
				+ " inner join Tab_province pr on pr.id=v.code_province"
				+ " inner join Tab_pays p on p.id=pr.code_pays "
				+ " where x.annees= "+annee;
		String stridpays = String.join(",", idpays);
		String stridprovince = String.join(",", idprovince);
		String stridville = String.join(",", idville);
		String stridcommune = String.join(",", idcommune);
		String stridadherent = String.join(",", idadherent);
		if(!idpays[0].equals("0")) {
			query+=" and p.id in("+stridpays+")";
    	}else if(!idprovince[0].equals("0")) {
			query+=" and pr.id in("+stridprovince+")";
		}else if(!idville[0].equals("0")) {
			query+=" and v.id in("+stridville+")";
		}else if(!idcommune[0].equals("0")) {
			query+=" and c.id in("+stridcommune+")";
		}else if(!idadherent[0].equals("0")) {
			query+=" and a.id in("+stridadherent+")";
		}
		String que="  group by a.code_mutuelle,a.id,i.id,i.nom,i.prenom,i.sexe,i.telephone_portable,i.email,c.id,c.commune,v.id,v.ville,pr.id,pr.province,p.id,p.pays";
		query+=que;
		query=query+" order by c.id desc ";
		List<adherentModel> collection=jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(adherentModel.class));
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			String _mois=iexercice.MoisString(mois);
			params.put("mois",_mois);
			params.put("annee", annee.toString());
			JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(collection);
			JasperPrint empReport = JasperFillManager.fillReport(
					JasperCompileManager.compileReport(
							ResourceUtils.getFile("classpath:etats//etatmensuel//etatmensuel.jrxml").getAbsolutePath()),
					params, ds);

			String encodedString = Base64.getEncoder().encodeToString(JasperExportManager.exportReportToPdf(empReport));
			return ResponseEntity.ok(new reportBase64(encodedString));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			return ResponseEntity.ok().body(e.getMessage());
		} catch (JRException e) {
			// TODO: handle exception
			return ResponseEntity.ok().body(e.getMessage());
		}
	}

	@Override
	public ResponseEntity<?> getReportdroitprestation(Integer query,String[] idpays, String[] idprovince, String[] idville,
			String[] idcommune, String[] idadherent) {
		  Calendar calendar = Calendar.getInstance();
		String queery="SELECT a.id as id_adherent,a.code_mutuelle,i.nom,i.prenom,i.sexe,i.naissance, "
				+ "i.profession,i.adresse,i.telephone_fixe,i.telephone_portable,i.email,a.situation_actuelle, "
				+ "i.photo,a.id_garantie,i.id_categorie,i.date_creation,c.id as id_commune,c.commune, "
				+ "v.id as id_ville,v.ville,pr.id as id_province,pr.province,p.id as id_pays,p.pays "
				+ "from Tab_adherent a  "
				+ "inner join Tab_identites i on a.identite=i.id "
				+ "inner join Tab_communes c on c.id=i.id_commune "
				+ "inner join Tab_ville v on v.id=c.code_ville "
				+ "inner join Tab_province pr on pr.id=v.code_province "
				+ "inner join Tab_pays p on p.id=pr.code_pays ";
				  if(query==1) {
				    	queery=queery+"where a.situation_actuelle=3 ";
					}else {
						queery=queery+"where a.situation_actuelle=2 ";
					}
				  String stridpays = String.join(",", idpays);
					String stridprovince = String.join(",", idprovince);
					String stridville = String.join(",", idville);
					String stridcommune = String.join(",", idcommune);
					String stridadherent = String.join(",", idadherent);
					if(!idpays[0].equals("0")) {
						queery+=" and p.id in("+stridpays+")";
			    	}else if(!idprovince[0].equals("0")) {
						queery+=" and pr.id in("+stridprovince+")";
					}else if(!idville[0].equals("0")) {
						queery+=" and v.id in("+stridville+")";
					}else if(!idcommune[0].equals("0")) {
						queery+=" and c.id in("+stridcommune+")";
					}else if(!idadherent[0].equals("0")) {
						queery+=" and a.id in("+stridadherent+")";
					}
					queery=queery+" order by c.id desc ";
					List<adherentModel> collection=jdbcTemplate.query(queery, BeanPropertyRowMapper.newInstance(adherentModel.class));
					for (adherentModel adherent : collection) {
						if (query == 1)
						{

						    adherent.setMontant_arriere( -iarriere_avance.MontantArrieres(1, adherent.getId_adherent(), null));
						    adherent.setEquivalent_mois(String.valueOf(Math.round(adherent.getMontant_arriere() / icotisation_emise.MontantCotisationemise(adherent.getId_adherent()))));
						    adherent.setType_suspension(query == 1 ? "automatique" : " ");
						}
						else
						{SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
						String formattedDate = outputFormat.format(adherent.getDate_creation());
						LocalDate date = LocalDate.parse(formattedDate);
						    int m = date.getMonthValue();
						    garantie_santesModels garantie = igarantie.GetGarantie(adherent.getId_garantie());
						    Integer mois =(calendar.get(Calendar.MONTH)+1)- m;
						    Integer observation = garantie == null ? 0 : garantie.getObservation();
						    Integer calcul = mois - observation;
						    adherent.setEquivalent_mois(String.valueOf(calcul == 0 ? 1 : calcul));
						}
						}
					try {
						Map<String, Object> params = new HashMap<String, Object>();
						String etatadherent="";
						String cheminetat="";
						if(query==1) {
							etatadherent="Suspendu(s)";
							cheminetat="classpath:etats//droitdeprestation//droitdeprestationsuspendu.jrxml";
						}else {
							etatadherent="En Observation";
							cheminetat="classpath:etats//droitdeprestation//droitdeprestationobservation.jrxml";
						}
						params.put("etatadherent",etatadherent);
						JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(collection);
						JasperPrint empReport = JasperFillManager.fillReport(
								JasperCompileManager.compileReport(
										ResourceUtils.getFile(cheminetat).getAbsolutePath()),
								params, ds);

						String encodedString = Base64.getEncoder().encodeToString(JasperExportManager.exportReportToPdf(empReport));
						return ResponseEntity.ok(new reportBase64(encodedString));
					} catch (FileNotFoundException e) {
						// TODO: handle exception
						return ResponseEntity.ok().body(e.getMessage());
					} catch (JRException e) {
						// TODO: handle exception
						return ResponseEntity.ok().body(e.getMessage());
					}
	}

}
