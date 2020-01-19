package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Film_Country;
import com.regue.spring.repository.Film_CountryRepository;

@Service("Film_CountryServices")
public class Film_CountryServicesImpl implements Film_CountryServices{
	
	@Autowired
	Film_CountryRepository film_CountryRepository;

	@Override
	public List<Film_Country> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Film_Country> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film_Country> FindCountryFilm(int id_country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Country add(Film_Country fg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Country edit(Film_Country fg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Country delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Country AddFilmCountry(int id_film, int id_country) {
	film_CountryRepository.AddFilmCountry(id_film, id_country);
		return null;
	}

}
