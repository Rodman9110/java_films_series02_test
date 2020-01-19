package com.regue.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.regue.spring.model.Countries;

public interface CountriesRepository extends JpaRepository<Countries, Integer>{
	
	@Query("SELECT c FROM Countries c INNER JOIN Film_Country f ON c.id = f.id_country WHERE f.id_film = ?1")
	Countries getFilmCountry(int id_film);

}
