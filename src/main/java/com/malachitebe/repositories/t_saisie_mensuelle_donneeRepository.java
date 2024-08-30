package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.t_saisie_mensuelle_donnee;

@Repository
public interface t_saisie_mensuelle_donneeRepository extends JpaRepository<t_saisie_mensuelle_donnee,Integer>{

}
