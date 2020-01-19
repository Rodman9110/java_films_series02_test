package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Film_Like;

public interface Film_LikesServices {
	
	List<Film_Like>listar();
	Optional<Film_Like> listarId(int id);
	List<Film_Like> FindFilmLikes(int id_like);
	Film_Like add(Film_Like l);
	Film_Like edit(Film_Like l);
	Film_Like delete(int id);
	Long getCountFilmLikes(int id_film);
	Film_Like postFilmLike(int id_user,int id_film);
	Film_Like findFilmLikes(int id_user,int id_film);
	Film_Like DeleteFilmLike(int id_user,int id_film);
	List<Film_Like> getCountAllFilmLike();
}
