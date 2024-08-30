package com.malachitebe.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.actes_prestataires;
import com.malachitebe.entities.exercice;


@Repository
public interface exerciceRepository extends JpaRepository<exercice,Integer>{
	@Query(nativeQuery=true,value="SELECT e.id,e.annees,e.cloture "
			+ "FROM Tab_exercice e "
			+ "where e.annees=:annee ")
	Optional<exercice> getexercice(@Param("annee")Integer annee);
}
