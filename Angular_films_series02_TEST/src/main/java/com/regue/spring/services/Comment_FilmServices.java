package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Comment_Film;


public interface Comment_FilmServices {
	
	List<Comment_Film>listar();
	Optional<Comment_Film> listarId(int id);
	List<Comment_Film> FindCommentFilm(int id_film);
	Comment_Film add(Comment_Film cf);
	Comment_Film edit(Comment_Film cf);
	Comment_Film delete(int id);

}
