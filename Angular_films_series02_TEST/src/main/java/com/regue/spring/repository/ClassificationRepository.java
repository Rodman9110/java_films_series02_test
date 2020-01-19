package com.regue.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.regue.spring.model.Classification;

public interface ClassificationRepository extends JpaRepository<Classification, Integer>{
	
	@Query("SELECT c FROM Classification c INNER JOIN Film_Classification f ON c.id = f.id_classification WHERE f.id_film = ?1")
	Classification getFilmClassification(int id_film);

}
