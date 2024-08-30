package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.actes_couverts;

@Repository
public interface actes_couvertsRepository extends JpaRepository<actes_couverts,Integer>{

}
