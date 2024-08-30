package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.mouvement_adherent;

@Repository
public interface mouvement_adherentRepository extends JpaRepository<mouvement_adherent,Long> {

}
