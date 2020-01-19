package com.regue.spring.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.User;
import com.regue.spring.repository.UserRepository;

@Service("UserServices")
public class UserServicesImpl implements UserServices{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User add(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User edit(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findUserIdForEmail(String email) {
		
		return userRepository.findUserIdForEmail(email);
	}

	@Override
	public User findUserForEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findUserForEmail(email);
	}

	@Override
	public User addUserRegister(String first_name, String last_name, String email, String password, int id_country,
			String img_profile, Date date_user, int id_role, int id_gender) {
		
		userRepository.addUserRegister(first_name, last_name, email, password, id_country, img_profile, date_user, id_role, id_gender);
		return null;
	}

	@Override
	public List<User> getAllUserNotAdded(int id_user) {
		// TODO Auto-generated method stub
		return userRepository.getAllUserNotAdded(id_user);
	}

}
