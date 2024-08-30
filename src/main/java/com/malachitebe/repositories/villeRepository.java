package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.ville;

@Repository
public interface villeRepository extends JpaRepository<ville,Integer>{

}
