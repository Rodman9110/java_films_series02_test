package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Film_Genres;


public interface Film_GenresServices {
	
	List<Film_Genres>listar();
	Optional<Film_Genres> listarId(int id);
	List<Film_Genres> FindGenresFilm(int id_genres);
	Film_Genres add(Film_Genres fg);
	Film_Genres edit(Film_Genres fg);
	Film_Genres delete(int id);
	Film_Genres AddFilmGender(int id_film, int id_genres);

}
