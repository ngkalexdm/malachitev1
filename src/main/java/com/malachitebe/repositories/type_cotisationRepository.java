package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.type_cotisation;

@Repository
public interface type_cotisationRepository extends JpaRepository<type_cotisation,Integer>{

}
