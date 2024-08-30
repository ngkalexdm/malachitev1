package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.cotisation_percue;


@Repository
public interface cotisation_percueRepository extends JpaRepository<cotisation_percue,Integer>{

}
