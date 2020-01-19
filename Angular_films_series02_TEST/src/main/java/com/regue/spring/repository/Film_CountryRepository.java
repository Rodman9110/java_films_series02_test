package com.regue.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.Film_Country;

public interface Film_CountryRepository extends JpaRepository<Film_Country, Integer>{
	
	@Modifying
	@Query(value = "INSERT INTO Film_Country (id_film,id_country) VALUES (:id_film,:id_country)", nativeQuery = true)
	@Transactional
	void AddFilmCountry(@Param("id_film") int id_film, @Param("id_country") int id_country);

}
