package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Actors_Country;

public interface Actors_CountryServices {
	
	List<Actors_Country>listar();
	Optional<Actors_Country> listarId(int id);
	Actors_Country add(Actors_Country a);
	Actors_Country edit(Actors_Country a);
	Actors_Country delete(int id);
	Actors_Country addActorsCountry(int id_actor,int id_country);

}
