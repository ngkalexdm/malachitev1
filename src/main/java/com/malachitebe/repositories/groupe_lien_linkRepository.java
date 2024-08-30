package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.groupe_lien_link;

@Repository
public interface groupe_lien_linkRepository extends JpaRepository<groupe_lien_link,Long>{

}
