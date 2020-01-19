package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.User_Gender;

public interface User_GenderServices {
	
	List<User_Gender>listar();
	Optional<User_Gender> listarId(int id);
	User_Gender add(User_Gender u);
	User_Gender edit(User_Gender u);
	User_Gender delete(int id);
	User_Gender addUserGender(int id_user,int id_gender);

}
