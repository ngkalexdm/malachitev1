package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.adherent_old;

@Repository
public interface adherent_oldRepository extends JpaRepository<adherent_old,Long>{

}
