package com.regue.spring.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.regue.spring.model.User;

public interface UserServices {
	
	List<User>listar();
	Optional<User> listarId(int id);
	User add(User u);
	User edit(User u);
	User delete(int id);
	int findUserIdForEmail(String email);
	User findUserForEmail(String email);
	User addUserRegister(String first_name,String last_name,String email, String password,int id_country,String img_profile,Date date_user, int id_role, int id_gender);
	List<User> getAllUserNotAdded (int id_user);
}
