package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.devises;


@Repository
public interface devisesRepository extends JpaRepository<devises,Integer>{

}
