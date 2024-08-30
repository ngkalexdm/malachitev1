package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.type_prestataire;

@Repository
public interface type_prestataireRepository extends JpaRepository<type_prestataire,Integer>{

}
