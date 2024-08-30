package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.arriere_avance;

@Repository
public interface arriere_avanceRepository extends JpaRepository<arriere_avance,Integer>{

}
