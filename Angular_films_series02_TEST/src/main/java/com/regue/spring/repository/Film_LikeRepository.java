package com.regue.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.Film_Like;

public interface Film_LikeRepository extends JpaRepository<Film_Like, Integer>{
	
	 @Modifying
	 @Query(value = "INSERT INTO Film_Like (id_user,id_film) VALUES (:id_user,:id_film)", nativeQuery = true)
	 @Transactional
	 void AddFilmLikes(@Param("id_user") int id_user, @Param("id_film") int id_film);
	 
	 
	 @Query("SELECT f FROM Film_Like f WHERE f.id_user = ?1 AND f.id_film = ?2" )
	 Film_Like findFilmLikes(int id_user,int id_film);
	 
	 @Query("SELECT count(f.id_user) FROM Film_Like f WHERE f.id_film = ?1")
	 Long getCountFilmLikes(int id_film);

	 @Modifying
	 @Transactional
	 @Query("DELETE FROM Film_Like f WHERE f.id_user = ?1 AND f.id_film = ?2")
	 void DeleteFilmLikes(int id_user,int id_film);
}
