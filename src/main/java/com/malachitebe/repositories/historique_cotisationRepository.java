package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.historique_cotisation;

@Repository
public interface historique_cotisationRepository extends JpaRepository<historique_cotisation,Integer>{

}
