package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.parametrage_annuel_prestataire;

@Repository
public interface parametrage_annuel_prestataireRepository extends JpaRepository<parametrage_annuel_prestataire,Integer>{

}
