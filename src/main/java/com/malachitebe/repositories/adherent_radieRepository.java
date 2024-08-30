package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.adherent_radie;

@Repository
public interface adherent_radieRepository extends JpaRepository<adherent_radie,Long> {

}
