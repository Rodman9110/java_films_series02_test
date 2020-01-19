package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Actors_Country;
import com.regue.spring.repository.Actors_CountryRepository;

@Service("Actors_CountryServices")
public class Actors_CountryServicesImpl  implements Actors_CountryServices{
	
	@Autowired
	Actors_CountryRepository actors_CountryRepository;

	@Override
	public List<Actors_Country> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Actors_Country> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actors_Country add(Actors_Country a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actors_Country edit(Actors_Country a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actors_Country delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actors_Country addActorsCountry(int id_actor, int id_country) {
		actors_CountryRepository.AddActorCountry(id_actor, id_country);
		return null;
	}

}
