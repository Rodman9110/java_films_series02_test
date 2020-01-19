package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Countries;


public interface CountriesServices {
	
	List<Countries>listar();
	Optional<Countries> listarId(int id);
	List<Countries> FindCountry(int id_country);
	Countries add(Countries c);
	Countries edit(Countries c);
	Countries delete(int id);
	Countries getFilmCountry(int id_film);

}
