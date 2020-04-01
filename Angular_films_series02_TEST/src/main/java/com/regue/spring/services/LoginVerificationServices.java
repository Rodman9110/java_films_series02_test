package com.regue.spring.services;

import java.util.List;
import java.util.Optional;


import com.regue.spring.model.Genres;
import com.regue.spring.model.User;

public interface LoginVerificationServices {
	
	List<User>listar();
	Optional<User> listarId(int id);
	User add(User u);
	User edit(User u);
	User delete(int id);
	User findLogin(String email, String password);

}
