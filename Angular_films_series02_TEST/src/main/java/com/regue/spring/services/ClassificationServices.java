package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Classification;


public interface ClassificationServices {
	
	List<Classification>listar();
	Optional<Classification> listarId(int id);
	Classification add(Classification c);
	Classification edit(Classification c);
	Classification delete(int id);
	Classification getFilmClassification(int id_film);


}
