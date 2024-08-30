package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.statut_prestataire;

@Repository
public interface statut_prestataireRepository extends JpaRepository<statut_prestataire,Integer>{

}
