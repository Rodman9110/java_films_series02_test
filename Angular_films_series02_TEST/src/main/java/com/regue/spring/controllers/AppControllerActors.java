package com.regue.spring.controllers;

import java.sql.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regue.spring.model.Actors;
import com.regue.spring.model.Actors_Film;
import com.regue.spring.model.Comment_Foro;
import com.regue.spring.services.ActorsServices;
import com.regue.spring.services.Actors_CountryServices;
import com.regue.spring.services.Actors_FilmServices;


@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping(path = "/actors")
public class AppControllerActors {
	
	@Autowired
	@Qualifier("ActorsServices")
	ActorsServices actorsServices;
	
	@Autowired
	@Qualifier("Actors_CountryServices")
	Actors_CountryServices actors_CountryServices;
	
	@Autowired
	@Qualifier("Actors_FilmServices")
	Actors_FilmServices actors_FilmServices;
	
	
	@GetMapping(path="getAllActors")
	public List<Actors> getAllActors(){
		return actorsServices.listar();
	}
	@GetMapping(path="getAllActorsOrderName")
	public List<Actors> getAllActorsOrderName(){
		return actorsServices.getAllActorsOrderName();
	}
	@GetMapping(path = {"getAllActorsFilm/{id_film}"})
	public List<Actors>getAllActorsFilm(@PathVariable("id_film") int id_film){
		
		return actorsServices.getAllActorsFilm(id_film);	
	}
	@PostMapping(path="postAddActor")
	public String postAddActor(@RequestBody Actors actor) {
		
		String name = actor.getName();
		int id_country = actor.getId_country();		
		Date date_actor = actor.getDate_actor();
		String details = actor.getDetails();
		String img_profile = actor.getImg_profile();
		
		String[] img_profile1 = img_profile.split(".png");
		String img_profile2 = img_profile1[0];
		System.err.println(img_profile2);
		
		String[] img_profile3 = img_profile2.split("fakepath.");
		String img_profile_complete = img_profile3[1];
		System.err.println(img_profile_complete);
		
		System.err.println(name+" "+id_country+" "+date_actor+" "+details+" "+img_profile_complete);
		
		if (actorsServices.findActorForName(name) !=null) {
			String error = "El Actor "+name+" ta esta add";
			System.err.println(error);
			return error;
			
		}
		else {
			
			actorsServices.AddActor(name, img_profile_complete, id_country, date_actor, details);			
			int id_actor = actorsServices.findActorIdForName(name);
			actors_CountryServices.addActorsCountry(id_actor, id_country);
			
			String Successfully = "Add Actor Successfully";
			System.err.println("Add Actor");
			return Successfully;
		}
			
	}
	
	@PostMapping(path="postAddActorFilm")
	public Actors postAddActorFilm(@RequestBody Actors_Film actors_Film) {
		
		int id_actor = actors_Film.getId_actor();
		int id_film = actors_Film.getId_film();
		
		if (actors_FilmServices.findActorsFilm(id_actor, id_film) != null) {
			
			System.err.println("El actor ya estaba añadido en la pelicula");
		}
		else {
			
			actors_FilmServices.addActorFilm(id_actor, id_film);
			System.err.println("Add Actor in film");
			
		}
	
			
		return null;
	}
	
	 
	@GetMapping(path = {"getSearchActorForName/{name}"})
	public List<Actors>getAllActorsFilm(@PathVariable("name") String name){
		
		return actorsServices.getSearchActorForName(name);	
	}
	

}
