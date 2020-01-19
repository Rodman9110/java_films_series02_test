package com.regue.spring.services;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.regue.spring.model.Genres;
import com.regue.spring.repository.GenresRepository;


@Service("GenresServices")
public class GenresServicesImpl implements GenresServices {
	
	@Autowired
	GenresRepository genresRepository;

	@Override
	public List<Genres> listar() {
		
		return genresRepository.findAll();
	}

	@Override
	public Optional<Genres> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genres add(Genres g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genres edit(Genres g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genres delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genres getFilmGenre(int id_film) {
		// TODO Auto-generated method stub
		return genresRepository.getFilmGenre(id_film);
	}

	

}
