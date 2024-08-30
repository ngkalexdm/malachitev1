package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.actes;

@Repository
public interface actesRepository extends JpaRepository<actes,Integer>{

}
