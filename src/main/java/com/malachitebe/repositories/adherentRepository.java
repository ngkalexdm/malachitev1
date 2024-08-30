package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.adherent;

@Repository
public interface adherentRepository extends JpaRepository<adherent,Long>{

}
