package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Countries;
import com.regue.spring.repository.CountriesRepository;

@Service("CountriesServices")
public class CountriesServicesImpl implements CountriesServices {
	
	@Autowired
	CountriesRepository countriesRepository;

	@Override
	public List<Countries> listar() {
		// TODO Auto-generated method stub
		return countriesRepository.findAll();
	}

	@Override
	public Optional<Countries> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Countries> FindCountry(int id_country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Countries add(Countries c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Countries edit(Countries c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Countries delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Countries getFilmCountry(int id_film) {
		// TODO Auto-generated method stub
		return countriesRepository.getFilmCountry(id_film);
	}

}
