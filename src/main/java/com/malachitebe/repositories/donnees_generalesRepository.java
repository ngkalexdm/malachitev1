package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.donnees_generales;


@Repository
public interface donnees_generalesRepository extends JpaRepository<donnees_generales,Long> {

}
