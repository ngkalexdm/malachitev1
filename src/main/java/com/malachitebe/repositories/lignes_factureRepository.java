package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.lignes_facture;

@Repository
public interface lignes_factureRepository extends JpaRepository<lignes_facture,Integer>{

}
