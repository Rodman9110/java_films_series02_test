package com.regue.spring.controllers;

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

import com.regue.spring.model.Films;
import com.regue.spring.model.My_Films;
import com.regue.spring.services.My_FilmsServices;

@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping(path = "/myFilms")
public class AppControllerMyFilms {
	
	@Autowired
	@Qualifier("My_FilmsServices")
	My_FilmsServices my_FilmsServices;
	
	@GetMapping(path = {"getCountMyFilmsUser/{id_user}"})
	public int  getCountMyFilms(@PathVariable("id_user") int id_user){
		System.err.println("Get My Film");
		return my_FilmsServices.getCountMyFilmsUser(id_user);	
	}
	@GetMapping(path = {"MyFilmsFavorites/{id_user}"})
	public List<Films>  getAllMyFilms(@PathVariable("id_user") int id_user){
		System.err.println("Get ALL MyFilm");
		return my_FilmsServices.getAllMyFilms(id_user);	
	}
	@PostMapping(path="postMyFavoriteFilm")
	public My_Films postMyFavoriteFilm(@RequestBody My_Films my_films) {
		
		int id_user = my_films.getId_user();
		int id_film = my_films.getId_film();
		System.err.println("id user "+id_user+" id film "+id_film);
		
		if (my_FilmsServices.getMyFavoriteFilm(id_user, id_film) != null) {
			System.err.println("la Film ya esta añadida a favorites");
			
			
		}else {
			my_FilmsServices.postMyFavoriteFilm(id_user, id_film);
			System.err.println("Add Favorites My Film");
		}
		
		return null;
	}
	
	@GetMapping(path = {"DeleteMyFilm/{id_user}/{id_film}"})
	public My_Films DeleteMyFavoriteFilm(@PathVariable("id_user") int id_user,@PathVariable("id_film") int id_film){
		System.err.println("Eliminar mi film de mis favoritos");
		return my_FilmsServices.DeleteMyFavoriteFilm(id_user, id_film);
	}
	

}
