package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.cotisation_emise;

@Repository
public interface cotisation_emiseRepository extends JpaRepository<cotisation_emise,Integer>{

}
