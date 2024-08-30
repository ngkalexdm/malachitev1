package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.ville_edc;

@Repository
public interface ville_edcRepository extends JpaRepository<ville_edc,Long>{

}
