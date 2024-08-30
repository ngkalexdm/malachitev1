package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.groupe_travaille;

@Repository
public interface groupe_travailleRepository extends JpaRepository<groupe_travaille,Integer>{

}
