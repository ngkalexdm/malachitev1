package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.prestataires;

@Repository
public interface prestatairesRepository extends JpaRepository<prestataires,Integer>{

}
