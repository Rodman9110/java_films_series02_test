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


import com.regue.spring.model.Classification;

import com.regue.spring.model.Countries;

import com.regue.spring.model.Gender;
import com.regue.spring.model.Genres;
import com.regue.spring.model.Role;
import com.regue.spring.model.User;

import com.regue.spring.services.ClassificationServices;

import com.regue.spring.services.CountriesServices;

import com.regue.spring.services.GenderService;
import com.regue.spring.services.GenresServices;
import com.regue.spring.services.LoginVerificationServices;
import com.regue.spring.services.RoleServices;
import com.regue.spring.services.UserServices;
import com.regue.spring.services.User_CountryServices;
import com.regue.spring.services.User_GenderServices;
import com.regue.spring.services.User_RoleServices;

@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping(path = "/api")
public class AppController {
	
	@Autowired
	@Qualifier("UserServices")
	UserServices userServices;
	
	@Autowired
	@Qualifier("User_RoleServices")
	User_RoleServices user_RoleServices;
	
	
	@Autowired
	@Qualifier("User_GenderServices")
	User_GenderServices user_GenderServices;

	@Autowired
	@Qualifier("User_CountryServices")
	User_CountryServices user_CountryServices;
	
	
//	@Autowired
//	@Qualifier("FilmsServices")
//	FilmsServices filmsServices;
//	
//	@Autowired
//	@Qualifier("Film_GenresServices")
//	Film_GenresServices film_GenresServices ;
//	
//	@Autowired
//	@Qualifier("Film_CountryServices")
//	Film_CountryServices film_CountryServices ;
//	
//	@Autowired
//	@Qualifier("Film_ClassificationServices")
//	Film_ClassificationServices film_ClassificationServices ;
	
	
	@Autowired
	@Qualifier("LoginVerificationServices")
	LoginVerificationServices loginVerificationServices ;
	
	@Autowired
	@Qualifier("CountriesServices")
	CountriesServices countriesServices ;
	
	@Autowired
	@Qualifier("GenderService")
	GenderService genderService;
	
	@Autowired
	@Qualifier("RoleServices")
	RoleServices roleServices;
	
	@Autowired
	@Qualifier("GenresServices")
	GenresServices genresServices;
	
	
	@Autowired
	@Qualifier("ClassificationServices")
	ClassificationServices classificationServices ;
	
	
	@PostMapping(path="/loginVerification")
	public User loginVerification(@RequestBody User user){
		System.out.println( "Dentro de Login Vereficatrion "+ user.getEmail());
		String email = user.getEmail();
		String password = user.getPassword();		
		System.out.println( loginVerificationServices.findLogin(email, password));
		return loginVerificationServices.findLogin(email, password);
	}
	@PostMapping(path="postAddRegisterUser")
	public User postAddRegisterUser(@RequestBody User user) {
		
		 String first_name = user.getFirst_name();
		 String last_name = user.getLast_name();
		 String email = user.getEmail();
		 String password = user.getPassword();
		 int id_country = user.getId_country();	
		 Date date_user = user.getDate_user();
		 int id_role = user.getId_role();
		 int id_gender = user.getId_gender();
		 String img_profile = user.getImg_profile();
		
		String[] img_profile1 = img_profile.split(".png");
		String img_profile2 = img_profile1[0];
		System.err.println(img_profile2);
		
		String[] img_profile3 = img_profile2.split("fakepath.");
		String img_profile_complete = img_profile3[1];
		System.err.println(img_profile_complete);
		
		System.err.println(first_name+" "+last_name+" "+email+" "+password+" "+id_country+" "+id_role +" "+ id_gender+" "+date_user+" "+img_profile_complete);
		
		if (userServices.findUserForEmail(email) != null) {
			System.err.println("EL usuario de nombre "+first_name+" y email "+email+" ya existe ");
			
		}else {			
			userServices.addUserRegister(first_name, last_name, email, password, id_country, img_profile_complete, date_user, id_role, id_gender);
			int id_user = userServices.findUserIdForEmail(email);
			
			//AÑADIR GENDER ROLE Y COUNTRY	
			user_GenderServices.addUserGender(id_user, id_gender);
			user_RoleServices.addUserRole(id_user, id_role);
			user_CountryServices.addUserCountry(id_user, id_country);
			
			
			System.err.println("Add User Register");
		}
			
		return null;
	}
	@GetMapping(path= {"getAllUserNotAdded/{id_user}"})
	public List<User> getAllUserNotAdded (@PathVariable("id_user") int id_user){
		
		return userServices.getAllUserNotAdded(id_user);
	}
	
	
	
//	@GetMapping(path="films")
//	public List<Films> getAllFilms(){
//		return filmsServices.listar();
//	}
//	@GetMapping(path = {"films/{id}"})
//	public Optional<Films>listarId(@PathVariable("id") int id){
////		System.out.println("Buscar por id");
//		return filmsServices.listarId(id);	
//	}
//	
//	@GetMapping(path = {"getSearchFilmsForName/{name}"})
//	public List<Films>getSearchFilmsForName(@PathVariable("name") String name){
//		
//		return filmsServices.getSearchFilmForName(name);	
//	}
//	
//	
//	
//	@PostMapping(path="postAddFilm")
//	public Films postAddFilm(@RequestBody Films film) {
//		
//		String name = film.getName();
//		String description = film.getDescription();
//		Date date_film = film.getDate_film();
//		int id_genres = film.getId_genres();
//		int id_country = film.getId_country();			
//		String trailer = film.getTrailer();
//		int id_classification = film.getId_classification();
//		String poster_film = film.getPoster_film();
//		
//		
//		String[] img_profile1 = poster_film.split(".png");
//		String img_profile2 = img_profile1[0];
//		System.err.println(img_profile2);
//		
//		String[] img_profile3 = img_profile2.split("fakepath.");
//		String poster_film_complete = img_profile3[1];
//		System.err.println(poster_film_complete);
//		
//		System.err.println(name+" "+description+" "+date_film+" "+id_genres+" "+id_country+" "+id_classification +" "+ trailer+" "+poster_film_complete);
//		
//		if (filmsServices.getFilmForName(name) != null) {
//			System.err.println("el Film "+name +" ya esta creado. ");
//			return null;
//			
//		}else {
//	
//			filmsServices.addFilm(name, description, date_film, id_genres, id_country, poster_film_complete, trailer, id_classification);
//			int id_film = filmsServices.getFilmIdForName(name);
//			film_GenresServices.AddFilmGender(id_film, id_genres);
//			film_CountryServices.AddFilmCountry(id_film, id_country);
//			film_ClassificationServices.AddFilmClassification(id_film, id_classification);
//			
//			
//			System.err.println("Add Film");
//			
//			
//			
//		}
//			
//		return null;
//	}
//	
//	@GetMapping(path="getTop100Films")
//	public List<Films> getTop100Films(){
//		return null;
//	}
//	@GetMapping(path={"search/{id_genres}"})
//	public List<Films> SearchGenresId(@PathVariable("id_genres") int id_genres){
//		System.out.println("Buscar por id genres");
//		return filmsServices.FindGenresFilm(id_genres);	
//	}
//	@GetMapping(path={"getFilmCountry/{id_film}"})
//	public Countries getFilmCountry(@PathVariable("id_film") int id_film){
//		System.err.println("Buscar Country");
//		return countriesServices.getFilmCountry(id_film);	
//	}
//
//	@GetMapping(path={"getFilmGenre/{id_film}"})
//	public Genres getFilmGenre(@PathVariable("id_film") int id_film){
//		System.err.println("Buscar Genres");
//		return genresServices.getFilmGenre(id_film);	
//	}
//	
//	@GetMapping(path={"getFilmClassification/{id_film}"})
//	public Classification getFilmClassification(@PathVariable("id_film") int id_film){
//		System.err.println("Buscar Classification");
//		return classificationServices.getFilmClassification(id_film);	
//	}
	
	
	@GetMapping(path="genres")
	public List<Genres> getAllGenres(){
		return genresServices.listar();
	}
	
	@GetMapping(path="classification")
	public List<Classification> getAllClassification(){
		return classificationServices.listar();
	}
	
	@GetMapping(path="countries")
	public List<Countries> getAllCountries(){
		return countriesServices.listar();
	}
	
	@GetMapping(path="countries/{id_country}")
	public List<Countries> getCountriesId(@PathVariable("id_country") int id_country){
		System.err.println("ss "+id_country);
		return countriesServices.FindCountryId(id_country);
	}
	@GetMapping(path="gender")
	public List<Gender> getAllGender(){
		return genderService.listar();
	}
	@GetMapping(path="gender/{id_gender}")
	public List<Gender> getGenderId(@PathVariable("id_gender") int id_gender){
		return genderService.FindGenderId(id_gender);
	}
	@GetMapping(path="role")
	public List<Role> getAllRole(){
		return roleServices.listar();
	}
	@GetMapping(path="role/{id_role}")
	public List<Role> getRoleId(@PathVariable("id_role") int id_role){
		return roleServices.FindRoleId(id_role);
	}
}
