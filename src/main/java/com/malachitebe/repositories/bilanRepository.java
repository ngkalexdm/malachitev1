package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.bilan;

@Repository
public interface bilanRepository extends JpaRepository<bilan,Integer>{

}
