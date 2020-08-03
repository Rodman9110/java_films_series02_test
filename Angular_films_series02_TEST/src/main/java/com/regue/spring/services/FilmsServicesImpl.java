package com.regue.spring.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Films;
import com.regue.spring.repository.FilmsRepository;


@Service("FilmsServices")
public class FilmsServicesImpl implements FilmsServices{
	
	@Autowired
	FilmsRepository filmsRepository;

	@Override
	public List<Films> listar() {
		
		return filmsRepository.findAll();
	}

	@Override
	public Optional<Films> listarId(int id) {
		
		return filmsRepository.findById(id);
	}

	@Override
	public Films add(Films p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Films edit(Films p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Films delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Films> FindGenresFilm(int id_genres) {
		
		return filmsRepository.findGenresFilm(id_genres);
	}

	@Override
	public Films getFilmForName(String name) {
		// TODO Auto-generated method stub
		return filmsRepository.getFilmForName(name);
	}

	@Override
	public Films addFilm(String name, String description, Date date_film, int id_genres, int id_country,
			String poster_film, String trailer, int id_classification) {
	
		filmsRepository.addFilm(name, description, date_film, id_genres, id_country, poster_film, trailer, id_classification);
		
		return null;
	}

	@Override
	public int getFilmIdForName(String name) {
		// TODO Auto-generated method stub
		return filmsRepository.getFilmIdForName(name);
	}

	@Override
	public List<Films> getSearchFilmForName(String name) {
		// TODO Auto-generated method stub
		return filmsRepository.getSearchFilmForName(name);
	}

	@Override
	public List<Films> FindClassificationFilm(int id_classification) {
		
		return filmsRepository.findClassificationFilm(id_classification);
	}

	@Override
	public List<Films> FindGenresClassificationFilm(int id_genres, int id_classification) {
		// TODO Auto-generated method stub
		return filmsRepository.FindGenresClassificationFilm(id_genres, id_classification);
	}

}
