package com.regue.spring.repository;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.Actors;

public interface ActorsRepository extends JpaRepository<Actors, Integer>{
	
	
	@Modifying
	@Query(value = "INSERT INTO Actors (name,img_profile,id_country,date_actor,details) VALUES (:name,:img_profile,:id_country,:date_actor,:details)", nativeQuery = true)
	@Transactional
	void addActor(
			@Param("name") String name,
			@Param("img_profile") String img_profile, 
			@Param("id_country") int id_country,			
			@Param("date_actor") Date date_actor,
			@Param("details") String details);
			

	@Query("SELECT a FROM Actors a INNER JOIN Actors_Film f ON a.id = f.id_actor WHERE f.id_film = ?1")
	List<Actors> getAllActorsFilm(int id_film);
	
	@Query("SELECT a FROM Actors a  WHERE a.name = ?1")
	Actors findActorForName(String name);
	
}
