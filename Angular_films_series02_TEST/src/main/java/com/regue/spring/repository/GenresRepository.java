package com.regue.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.regue.spring.model.Genres;

public interface GenresRepository extends JpaRepository<Genres,Integer> {
	
	 @Query("SELECT g FROM Genres g INNER JOIN Film_Genres f ON g.id = f.id_genres WHERE f.id_film = ?1")
	 Genres getFilmGenre(int id_film);

}
