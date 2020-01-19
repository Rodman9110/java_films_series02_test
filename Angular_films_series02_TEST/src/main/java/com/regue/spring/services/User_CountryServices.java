package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.User_Country;

public interface User_CountryServices {
	
	List<User_Country>listar();
	Optional<User_Country> listarId(int id);
	User_Country add(User_Country u);
	User_Country edit(User_Country u);
	User_Country delete(int id);
	User_Country addUserCountry(int id_user,int id_country);

}
