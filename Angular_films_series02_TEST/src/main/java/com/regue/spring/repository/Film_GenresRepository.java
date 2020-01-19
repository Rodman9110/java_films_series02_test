package com.regue.spring.repository;





import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.Film_Genres;

public interface Film_GenresRepository extends Repository<Film_Genres, Integer>{
	

	 @Query("SELECT f FROM Film_Genres f where f.id_genres = ?1")
	 public List<Film_Genres> findGenresFilm(int id_genres);
	
	 @Modifying
	 @Query(value = "INSERT INTO Film_Genres (id_film,id_genres) VALUES (:id_film,:id_genres)", nativeQuery = true)
	 @Transactional
	 void AddFilmGenres(@Param("id_film") int id_film, @Param("id_genres") int id_genres);
	

}
