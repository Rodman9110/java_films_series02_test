package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Film_Classification;
import com.regue.spring.repository.Film_ClassificationRepository;

@Service("Film_ClassificationServices")
public class Film_ClassificationServicesImpl implements Film_ClassificationServices{
	
	@Autowired
	Film_ClassificationRepository film_ClassificationRepository;

	@Override
	public List<Film_Classification> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Film_Classification> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film_Classification> Findid_classificationFilm(int id_classification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Classification add(Film_Classification c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Classification edit(Film_Classification c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Classification delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Classification AddFilmClassification(int id_film, int id_classification) {
		film_ClassificationRepository.AddFilmClassification(id_film, id_classification);
		return null;
	}

}
