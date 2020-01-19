package com.regue.spring.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Actors;
import com.regue.spring.repository.ActorsRepository;

@Service("ActorsServices")
public class ActorsServicesImpl implements ActorsServices{
	
	@Autowired
	ActorsRepository actorsRepository;

	@Override
	public List<Actors> listar() {
		// TODO Auto-generated method stub
		return actorsRepository.findAll();
	}

	@Override
	public Optional<Actors> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actors add(Actors a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actors edit(Actors a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actors delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findActorIdForName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Actors findActorForName(String name) {
		// TODO Auto-generated method stub
		return actorsRepository.findActorForName(name);
	}

	@Override
	public Actors AddActor(String name, String img_profile, int id_country, Date date_actor, String details) {
		
		actorsRepository.addActor(name, img_profile, id_country, date_actor, details);
		
		return null;
	}

	@Override
	public List<Actors> getAllActorsFilm(int id_film) {
		// TODO Auto-generated method stub
		return actorsRepository.getAllActorsFilm(id_film);
	}

	

}
