package com.malachitebe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.malachitebe.entities.province;
@Repository
public interface provinceRepository  extends JpaRepository<province,Integer> {

}
