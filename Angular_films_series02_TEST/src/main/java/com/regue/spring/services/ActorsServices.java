package com.regue.spring.services;


import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.regue.spring.model.Actors;

public interface ActorsServices {
	
	List<Actors>listar();
	Optional<Actors> listarId(int id);
	Actors add(Actors a);
	Actors edit(Actors a);
	Actors delete(int id);
	List<Actors>getAllActorsFilm(int id_film);
	int findActorIdForName(String name);
	Actors findActorForName(String name);
	Actors AddActor(
			String name,
			String img_profile, 
			int id_country,			
			Date date_actor,
			String details
		);
	List<Actors> getAllActorsOrderName();
	List<Actors> getSearchActorForName(String name);
	

}
