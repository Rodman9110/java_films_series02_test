package com.regue.spring.controllers;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regue.spring.model.Classification;
import com.regue.spring.model.Countries;
import com.regue.spring.model.Films;
import com.regue.spring.model.Genres;
import com.regue.spring.services.ClassificationServices;
import com.regue.spring.services.CountriesServices;
import com.regue.spring.services.Film_ClassificationServices;
import com.regue.spring.services.Film_CountryServices;
import com.regue.spring.services.Film_GenresServices;
import com.regue.spring.services.FilmsServices;
import com.regue.spring.services.GenderService;
import com.regue.spring.services.GenresServices;

@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping(path = "/apiFilm")
public class AppControllerFilms {

	@Autowired
	@Qualifier("FilmsServices")
	FilmsServices filmsServices;
	
	@Autowired
	@Qualifier("Film_GenresServices")
	Film_GenresServices film_GenresServices ;
	
	@Autowired
	@Qualifier("Film_CountryServices")
	Film_CountryServices film_CountryServices ;
	
	@Autowired
	@Qualifier("Film_ClassificationServices")
	Film_ClassificationServices film_ClassificationServices ;
	
	@Autowired
	@Qualifier("ClassificationServices")
	ClassificationServices classificationServices ;
	
	@Autowired
	@Qualifier("CountriesServices")
	CountriesServices countriesServices ;
	
	@Autowired
	@Qualifier("GenresServices")
	GenresServices genresServices;
	
	@Autowired
	@Qualifier("GenderService")
	GenderService genderService;
	
	
	@GetMapping(path="films")
	public List<Films> getAllFilms(){
		System.err.println("Api Film/films");
		return filmsServices.listar();
	}
	@GetMapping(path = {"films/{id}"})
	public Optional<Films>listarId(@PathVariable("id") int id){
//		System.out.println("Buscar por id");
		return filmsServices.listarId(id);	
	}
	
	@GetMapping(path = {"getSearchFilmsForName/{name}"})
	public List<Films>getSearchFilmsForName(@PathVariable("name") String name){
		
		return filmsServices.getSearchFilmForName(name);	
	}
	
	
	
	@PostMapping(path="postAddFilm")
	public Films postAddFilm(@RequestBody Films film) {
		
		String name = film.getName();
		String description = film.getDescription();
		Date date_film = film.getDate_film();
		int id_genres = film.getId_genres();
		int id_country = film.getId_country();			
		String trailer = film.getTrailer();
		int id_classification = film.getId_classification();
		String poster_film = film.getPoster_film();
		
		
		String[] img_profile1 = poster_film.split(".png");
		String img_profile2 = img_profile1[0];
		System.err.println(img_profile2);
		
		String[] img_profile3 = img_profile2.split("fakepath.");
		String poster_film_complete = img_profile3[1];
		System.err.println(poster_film_complete);
		
		System.err.println(name+" "+description+" "+date_film+" "+id_genres+" "+id_country+" "+id_classification +" "+ trailer+" "+poster_film_complete);
		
		if (filmsServices.getFilmForName(name) != null) {
			System.err.println("el Film "+name +" ya esta creado. ");
			return null;
			
		}else {
	
			filmsServices.addFilm(name, description, date_film, id_genres, id_country, poster_film_complete, trailer, id_classification);
			int id_film = filmsServices.getFilmIdForName(name);
			film_GenresServices.AddFilmGender(id_film, id_genres);
			film_CountryServices.AddFilmCountry(id_film, id_country);
			film_ClassificationServices.AddFilmClassification(id_film, id_classification);
			
			
			System.err.println("Add Film");
			
			
			
		}
			
		return null;
	}
	
	@GetMapping(path="getTop100Films")
	public List<Films> getTop100Films(){
		return null;
	}
	@GetMapping(path={"search/{id_genres}"})
	public List<Films> SearchGenresId(@PathVariable("id_genres") int id_genres){
		System.out.println("Buscar por id genres");
		return filmsServices.FindGenresFilm(id_genres);	
	}
	@GetMapping(path={"getFilmCountry/{id_film}"})
	public Countries getFilmCountry(@PathVariable("id_film") int id_film){
		System.err.println("Buscar Country");
		return countriesServices.getFilmCountry(id_film);	
	}

	@GetMapping(path={"getFilmGenre/{id_film}"})
	public Genres getFilmGenre(@PathVariable("id_film") int id_film){
		System.err.println("Buscar Genres");
		return genresServices.getFilmGenre(id_film);	
	}
	
	@GetMapping(path={"getFilmClassification/{id_film}"})
	public Classification getFilmClassification(@PathVariable("id_film") int id_film){
		System.err.println("Buscar Classification");
		return classificationServices.getFilmClassification(id_film);	
	}
}
