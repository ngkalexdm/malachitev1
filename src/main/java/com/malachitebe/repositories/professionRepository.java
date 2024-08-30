package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.profession;

@Repository
public interface professionRepository extends JpaRepository<profession,Integer>{

}
