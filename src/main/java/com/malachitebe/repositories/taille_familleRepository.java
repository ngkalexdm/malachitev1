package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.taille_famille;

@Repository
public interface taille_familleRepository extends JpaRepository<taille_famille,	Long>{

}
