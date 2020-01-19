package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Actors_Film;

public interface Actors_FilmServices {
	
	List<Actors_Film>listar();
	Optional<Actors_Film> listarId(int id);
	Actors_Film add(Actors_Film a);
	Actors_Film edit(Actors_Film a);
	Actors_Film delete(int id);
	Actors_Film addActorFilm(int id_actor,int id_film);
	Actors_Film findActorsFilm(int id_actor, int id_film);

}
