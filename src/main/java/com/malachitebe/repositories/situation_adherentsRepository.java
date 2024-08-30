package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.situation_adherents;

@Repository
public interface situation_adherentsRepository extends JpaRepository<situation_adherents,Integer>{

}
