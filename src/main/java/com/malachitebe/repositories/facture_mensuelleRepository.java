package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.facture_mensuelle;


@Repository
public interface facture_mensuelleRepository extends JpaRepository<facture_mensuelle,Integer>{

}
