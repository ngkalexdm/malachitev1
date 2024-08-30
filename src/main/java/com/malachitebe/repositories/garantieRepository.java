package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.garantie;

@Repository
public interface garantieRepository extends JpaRepository<garantie,Integer>{

}
