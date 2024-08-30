package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.facture_prestataire;

@Repository
public interface facture_prestataireRepository extends JpaRepository<facture_prestataire,Integer>{

}
