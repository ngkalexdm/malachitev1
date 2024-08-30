package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.type_fichier;

@Repository
public interface type_fichierRepository extends JpaRepository<type_fichier,Long>{

}
