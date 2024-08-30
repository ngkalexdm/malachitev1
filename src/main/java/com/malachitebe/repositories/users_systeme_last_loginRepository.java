package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malachitebe.entities.users_systeme_last_login;

@Repository
public interface users_systeme_last_loginRepository extends JpaRepository<users_systeme_last_login,Long>{

}
