package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.pyramide_age_malade;

@Repository
public interface pyramide_age_maladeRepository extends JpaRepository<pyramide_age_malade,Long>{

}
