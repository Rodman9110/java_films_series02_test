package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Film_Genres;
import com.regue.spring.repository.Film_GenresRepository;


@Service("Film_GenresServices")
public class Film_GenresServicesImpl implements Film_GenresServices {
	
	@Autowired
	Film_GenresRepository film_GenresRepository;
	
	@Override
	public List<Film_Genres> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Film_Genres> listarId(int id_genres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Genres add(Film_Genres fg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Genres edit(Film_Genres fg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Genres delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film_Genres> FindGenresFilm(int id_genres) {
		//
		return film_GenresRepository.findGenresFilm(id_genres);
	}

	@Override
	public Film_Genres AddFilmGender(int id_film, int id_genres) {	
		film_GenresRepository.AddFilmGenres(id_film, id_genres);
		return null;
	}

	

}
