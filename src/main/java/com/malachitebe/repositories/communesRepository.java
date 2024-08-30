package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.communes;

@Repository
public interface communesRepository extends JpaRepository<communes,Integer>{

}
