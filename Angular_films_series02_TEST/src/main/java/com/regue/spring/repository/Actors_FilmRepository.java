package com.regue.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.Actors_Film;

public interface Actors_FilmRepository extends JpaRepository<Actors_Film, Integer>{
	
	
	@Modifying
	@Query(value = "INSERT INTO Actors_Film (id_actor,id_film) VALUES (:id_actor,:id_film)", nativeQuery = true)
	@Transactional
	void AddActorFilm(@Param("id_actor") int id_actor, @Param("id_film") int id_film);
	
	@Query("SELECT a FROM Actors_Film a WHERE a.id_actor = ?1 AND a.id_film = ?2")
	Actors_Film findActorsFilm(int id_actor, int id_film);

}
