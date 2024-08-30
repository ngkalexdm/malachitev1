package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.pays;

@Repository
public interface paysRepository extends JpaRepository<pays,Integer>{

}
