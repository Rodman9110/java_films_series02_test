package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Film_Country;

public interface Film_CountryServices {
	
	List<Film_Country>listar();
	Optional<Film_Country> listarId(int id);
	List<Film_Country> FindCountryFilm(int id_country);
	Film_Country add(Film_Country fg);
	Film_Country edit(Film_Country fg);
	Film_Country delete(int id);
	Film_Country AddFilmCountry(int id_film, int id_country);

}
