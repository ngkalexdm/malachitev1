package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.quartier;

@Repository
public interface quartierRepository extends JpaRepository<quartier,Integer> {

}
