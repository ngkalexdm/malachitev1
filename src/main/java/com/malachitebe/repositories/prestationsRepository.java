package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.prestations;

@Repository
public interface prestationsRepository extends JpaRepository<prestations,Integer>{

}
