package com.regue.spring.services;

import java.util.List;
import java.util.Optional;


import com.regue.spring.model.Genres;

public interface GenresServices {
	
	List<Genres>listar();
	Optional<Genres> listarId(int id);
	Genres add(Genres g);
	Genres edit(Genres g);
	Genres delete(int id);
	Genres getFilmGenre(int id_film);
}
