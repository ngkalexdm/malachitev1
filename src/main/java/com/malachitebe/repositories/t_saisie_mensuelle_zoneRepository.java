package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.t_saisie_mensuelle_zone;

@Repository
public interface t_saisie_mensuelle_zoneRepository extends JpaRepository<t_saisie_mensuelle_zone,Long>{

}
