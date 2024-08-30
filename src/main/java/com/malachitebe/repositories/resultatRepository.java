package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.resultat;

@Repository
public interface resultatRepository extends JpaRepository<resultat,Integer>{

}
