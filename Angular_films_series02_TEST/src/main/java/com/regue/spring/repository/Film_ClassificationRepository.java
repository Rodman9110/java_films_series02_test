package com.regue.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.Film_Classification;

public interface Film_ClassificationRepository extends JpaRepository<Film_Classification, Integer>{
	
	@Modifying
	@Query(value = "INSERT INTO Film_Classification (id_film,id_classification) VALUES (:id_film,:id_classification)", nativeQuery = true)
	@Transactional
	void AddFilmClassification(@Param("id_film") int id_film, @Param("id_classification") int id_classification);

}
