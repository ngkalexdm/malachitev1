package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.facture_acte;


@Repository
public interface facture_acteRepository extends JpaRepository<facture_acte,Integer> {

}
