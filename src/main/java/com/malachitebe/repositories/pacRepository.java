package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.pac;

@Repository
public interface pacRepository extends JpaRepository<pac,Integer>{

}
