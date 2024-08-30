package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.etat_adherent;

@Repository
public interface etat_adherentRepository extends JpaRepository<etat_adherent,Integer>{

}
