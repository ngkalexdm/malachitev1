package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.garantie_couverture;

@Repository
public interface garantie_couvertureRepository extends JpaRepository<garantie_couverture,Integer>{

}
