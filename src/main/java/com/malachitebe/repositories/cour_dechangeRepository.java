package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.cour_dechange;


@Repository
public interface cour_dechangeRepository extends JpaRepository<cour_dechange,Integer>{

}
