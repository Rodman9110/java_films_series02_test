package com.regue.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.Actors_Country;

public interface Actors_CountryRepository extends JpaRepository<Actors_Country, Integer>{
	
	@Modifying
	@Query(value = "INSERT INTO Actors_Country (id_actor,id_country) VALUES (:id_actor,:id_country)", nativeQuery = true)
	@Transactional
	void AddActorCountry(@Param("id_actor") int id_actor, @Param("id_country") int id_country);

}
