package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.tampon;

@Repository
public interface tamponRepository extends JpaRepository<tampon,Long>{

}
