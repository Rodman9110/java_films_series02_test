package com.regue.spring.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.regue.spring.model.Films;
import com.regue.spring.model.My_Films;

public interface My_FilmsRepository extends JpaRepository<My_Films, Integer>{
	
	@Query("SELECT count(m.id_user) FROM My_Films m WHERE m.id_user = ?1")
	int getCountMyFilmsUser(int id_user);
	
	@Query("SELECT m FROM My_Films m WHERE m.id_user = ?1 AND m.id_film = ?2")
	My_Films getMyFavoriteFilm(int id_user,int id_film);
	
	@Modifying
	@Query(value = "INSERT INTO My_Films (id_user,id_film) VALUES (:id_user,:id_film)", nativeQuery = true)
	@Transactional
	void AddMyFavoriteFilm(int id_user, int id_film);
	
	@Query("SELECT f FROM Films f INNER JOIN My_Films m ON f.id = m.id_film WHERE m.id_user = ?1")
	List<Films> getAllMyFilms(int id_user);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM My_Films m WHERE m.id_user = ?1 AND m.id_film = ?2")
	void DeleteMyFavoriteFilm(int id_user,int id_film);
	

}
