package com.regue.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.regue.spring.model.Comment_Film;



public interface Comment_FilmRepository  extends JpaRepository<Comment_Film, Integer>{
	
	@Query("SELECT c FROM Comment_Film c where c.id_film = ?1  order by c.id desc")
	public List<Comment_Film> findCommentFilm(Integer id_film);
	
	

}
