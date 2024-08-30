package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.parametrage_annuel;

@Repository
public interface parametrage_annuelRepository extends JpaRepository<parametrage_annuel,Integer>{

}
