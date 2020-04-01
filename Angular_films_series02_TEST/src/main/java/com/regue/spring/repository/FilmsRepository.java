package com.regue.spring.repository;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.Films;

public interface FilmsRepository extends JpaRepository<Films, Integer> {
	
	@Query("SELECT f FROM Films f where f.id_genres = ?1")
	 public List<Films> findGenresFilm(Integer id_genres);
	
	@Modifying
	@Query(value = "INSERT INTO Films (name,description,date_film,id_genres,id_country,poster_film,trailer,id_classification) VALUES (:name,:description,:date_film,:id_genres,:id_country,:poster_film,:trailer,:id_classification)", nativeQuery = true)
	@Transactional
	void addFilm(
			@Param("name") String name,
			@Param("description") String description, 
			@Param("date_film") Date date_film, 
			@Param("id_genres") int id_genres,
			@Param("id_country") int id_country,					
			@Param("poster_film") String poster_film,			
			@Param("trailer") String trailer,
			@Param("id_classification") int id_classification);
	
	@Query("SELECT f FROM Films f where f.name = ?1")
	public Films getFilmForName(String name);
	
	@Query("SELECT f.id FROM Films f where f.name = ?1")
	int getFilmIdForName(String name);
	
	@Query("SELECT f FROM Films f where f.name LIKE %:name%")
	List<Films> getSearchFilmForName(@Param("name")String name);
	
	@Query("SELECT f FROM Films f INNER JOIN Film_Like l ON f.id = id_film ")
	List<Films> getTop100Films();

}
