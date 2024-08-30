package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.situation_compte;

@Repository
public interface situation_compteRepository extends JpaRepository<situation_compte,Integer>{

}
