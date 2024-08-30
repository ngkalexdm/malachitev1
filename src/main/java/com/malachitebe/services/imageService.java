package com.malachitebe.services;

import org.springframework.stereotype.Service;
import org.apache.commons.io.IOUtils;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption; 

@Service
public class imageService {

    public final String storageDirectoryPath = "/static/imagesprofil";
    public String cheminimage(MultipartFile file,String dossier) {
    	
        /* nous allons extraire le nom du fichier (avec extension) du fichier donné pour le stocker sur notre machine locale pour l'instant
         et plus tard dans la machine virtuelle lorsque nous déploierons le projet.
         */
    	
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        /* Le chemin dans lequel nous allons stocker notre image . nous pourrions le changer plus tard
         basé sur l'OS de la machine virtuelle dans laquelle nous allons déployer le projet.
         Dans mon cas, j'utilise Windows 10.
         */
        Path storageDirectory = Paths.get(storageDirectoryPath+"\\"+dossier);
        /*
        * nous ferons juste une simple vérification pour vérifier si le dossier dans lequel nous allons stocker nos images existe ou nonnous ferons juste une simple vérification pour vérifier si le dossier dans lequel nous allons stocker nos images existe ou nonnous ferons juste une simple vérification pour vérifier si le dossier dans lequel nous allons stocker nos images existe ou non
        * */
        if(!Files.exists(storageDirectory)){ // si le dossier n'existe pas
            try {
                Files.createDirectories(storageDirectory); // nous créons le répertoire dans le chemin du répertoire de stockage donné
            }catch (Exception e){
                e.printStackTrace();// imprimer l'exception
            }
        }

        Path destination = Paths.get(storageDirectory.toString() + "\\" + fileName);

        try {
            Files.copy(file.getInputStream(), destination, StandardCopyOption.REPLACE_EXISTING);// nous copions tous les octets d'un flux d'entrée dans un fichier

        } catch (IOException e) {
            e.printStackTrace();
        }
        // la réponse sera l'URL de téléchargement de l'image
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("api/image/getImage/"+dossier+"/")
                .path(fileName)
                .toUriString();
        // renvoie l'URL de l'image de téléchargement en tant qu'entité de réponse
        return fileDownloadUri;
    }
    
public ResponseEntity<?> uploadToLocalFileSystem(MultipartFile file,String dossier) {
	System.out.println("a11");
        /* nous allons extraire le nom du fichier (avec extension) du fichier donné pour le stocker sur notre machine locale pour l'instant
         et plus tard dans la machine virtuelle lorsque nous déploierons le projet.
         */
    	
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        /* Le chemin dans lequel nous allons stocker notre image . nous pourrions le changer plus tard
         basé sur l'OS de la machine virtuelle dans laquelle nous allons déployer le projet.
         Dans mon cas, j'utilise Windows 10.
         */
        Path storageDirectory = Paths.get(storageDirectoryPath+"\\"+dossier);
        System.out.println("a12");
        /*
        * nous ferons juste une simple vérification pour vérifier si le dossier dans lequel nous allons stocker nos images existe ou nonnous ferons juste une simple vérification pour vérifier si le dossier dans lequel nous allons stocker nos images existe ou nonnous ferons juste une simple vérification pour vérifier si le dossier dans lequel nous allons stocker nos images existe ou non
        * */
        if(!Files.exists(storageDirectory)){ // si le dossier n'existe pas
            try {
                Files.createDirectories(storageDirectory); // nous créons le répertoire dans le chemin du répertoire de stockage donné
            }catch (Exception e){
                e.printStackTrace();// imprimer l'exception
            }
        }

        Path destination = Paths.get(storageDirectory.toString() + "\\" + fileName);

        try {
            Files.copy(file.getInputStream(), destination, StandardCopyOption.REPLACE_EXISTING);// nous copions tous les octets d'un flux d'entrée dans un fichier

        } catch (IOException e) {
            e.printStackTrace();
        }
        // la réponse sera l'URL de téléchargement de l'image
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("api/image/getImage/"+dossier+"/")
                .path(fileName)
                .toUriString();
        // renvoie l'URL de l'image de téléchargement en tant qu'entité de réponse
        return ResponseEntity.ok(fileDownloadUri);
    }

    public  byte[] getImageWithMediaType(String imageName,String dossier) throws IOException {
        Path destination =   Paths.get(storageDirectoryPath+"\\"+dossier+"\\"+imageName);// récupérer l'image par son nom
        
        return IOUtils.toByteArray(destination.toUri());
    }
}
