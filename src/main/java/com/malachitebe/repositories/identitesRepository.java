package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.identites;

@Repository
public interface identitesRepository extends JpaRepository<identites,Long>{

}
