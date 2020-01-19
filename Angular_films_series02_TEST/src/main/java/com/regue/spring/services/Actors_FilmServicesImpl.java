package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Actors_Film;
import com.regue.spring.repository.Actors_FilmRepository;

@Service("Actors_FilmServices")
public class Actors_FilmServicesImpl implements Actors_FilmServices{
	
	@Autowired
	Actors_FilmRepository actors_FilmRepository;

	@Override
	public List<Actors_Film> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Actors_Film> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actors_Film add(Actors_Film a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actors_Film edit(Actors_Film a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actors_Film delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actors_Film addActorFilm(int id_actor, int id_film) {
		actors_FilmRepository.AddActorFilm(id_actor, id_film);
		return null;
	}

	@Override
	public Actors_Film findActorsFilm(int id_actor, int id_film) {
		
		return actors_FilmRepository.findActorsFilm(id_actor, id_film);
	}

}
