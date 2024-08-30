package com.malachitebe.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.actes_prestataires;
import com.malachitebe.models.actes_couvertModel;
@Repository
public interface actes_prestatairesRepository extends JpaRepository<actes_prestataires,Long>{
@Query(nativeQuery=true,value="SELECT id,id_prestataire,id_acte,cout_prevu,date_creation "
		+ "	FROM Tab_actes_prestataires "
		+ "	where id_prestataire=:idprestataire "
		+ " and id_acte=:idacte")
Optional<actes_prestataires> getacteprestataire(@Param("idprestataire")Integer idprestataire,@Param("idacte")Integer idacte);

@Query(nativeQuery=true,value="delete FROM  Tab_actes_prestataires "
		+ "	where id_prestataire=:idprestataire "
		+ " and id_acte=:idacte")
Boolean deleteacteprestataire(@Param("idprestataire")Integer idprestataire,@Param("idacte")Integer idacte);
 



}
