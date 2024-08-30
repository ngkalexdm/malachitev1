package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.zones;

@Repository
public interface zonesRepository extends JpaRepository<zones,Integer>{

}
