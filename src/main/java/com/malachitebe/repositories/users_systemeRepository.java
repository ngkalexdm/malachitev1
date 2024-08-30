package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.users_systeme;

@Repository
public interface users_systemeRepository extends JpaRepository<users_systeme,Long>{

}
