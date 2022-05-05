package com.fatihcakir.simpleService.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatihcakir.simpleService.entity.Simple;

@Repository
public interface SimpleDao extends JpaRepository<Simple, Integer>{

}
