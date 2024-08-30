package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.etat_pac;


@Repository
public interface etat_pacRepository extends JpaRepository<etat_pac,Integer> {

}
