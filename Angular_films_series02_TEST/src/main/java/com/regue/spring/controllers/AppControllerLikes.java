package com.regue.spring.controllers;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.regue.spring.model.Film_Like;
import com.regue.spring.services.Film_LikesServices;

@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping(path = "/like")
public class AppControllerLikes {
	
	@Autowired
	@Qualifier("Film_LikesServices")
	Film_LikesServices film_LikesServices;
	
	@GetMapping(path = {"getCountFilmLike/{id_film}"})
	public Long getCountFilmLikes(@PathVariable("id_film") int id_film){
		System.err.println("Get Like");
		return film_LikesServices.getCountFilmLikes(id_film);	
	}
	@PostMapping(path="AddFilmLike")
	public Film_Like AddFilmLike(@RequestBody Film_Like like) {
		
		int id_user = like.getId_user();
		int id_film = like.getId_film();
		
		if (film_LikesServices.findFilmLikes(id_user, id_film) != null) {			
			film_LikesServices.DeleteFilmLike(id_user, id_film);			
			System.err.println("Like eliminado");			
			return null;	
		}else {
			film_LikesServices.postFilmLike(id_user, id_film);
			System.err.println("Like Añadido");
		}	
		return null;
	}
	
	
}
