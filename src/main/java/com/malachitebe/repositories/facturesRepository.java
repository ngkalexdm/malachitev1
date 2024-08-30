package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.malachitebe.entities.factures;

@Repository
public interface facturesRepository extends JpaRepository<factures,Integer>{

}
