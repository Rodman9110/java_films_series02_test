package com.regue.spring.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;


import com.regue.spring.model.Films;

public interface FilmsServices {
	
	List<Films>listar();
	Optional<Films> listarId(int id);
	Films add(Films p);
	Films edit(Films p);
	Films delete(int id);
	List<Films> FindGenresFilm(int id_genres);
	Films getFilmForName(String name);
	int getFilmIdForName(String name);
	Films addFilm(
			 String name,
			 String description, 
			 Date date_film, 
			 int id_genres,
			 int id_country,					
			 String poster_film,			
			 String trailer,
			 int id_classification);
	
	List<Films> getSearchFilmForName(String name);

}
