package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Film_Classification;

public interface Film_ClassificationServices {
	
	List<Film_Classification>listar();
	Optional<Film_Classification> listarId(int id);
	List<Film_Classification> Findid_classificationFilm(int id_classification);
	Film_Classification add(Film_Classification c);
	Film_Classification edit(Film_Classification c);
	Film_Classification delete(int id);
	Film_Classification AddFilmClassification(int id_film, int id_classification);

}
