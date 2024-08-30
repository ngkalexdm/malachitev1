package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.beneficiaires;

@Repository
public interface beneficiairesRepository extends JpaRepository<beneficiaires,Long> {

}
