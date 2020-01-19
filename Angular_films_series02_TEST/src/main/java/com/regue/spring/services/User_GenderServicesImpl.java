package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.User_Gender;
import com.regue.spring.repository.User_GenderRepository;

@Service("User_GenderServices")
public class User_GenderServicesImpl implements User_GenderServices{
	
	@Autowired
	User_GenderRepository user_GenderRepository;

	@Override
	public List<User_Gender> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User_Gender> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Gender add(User_Gender u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Gender edit(User_Gender u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Gender delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Gender addUserGender(int id_user, int id_gender) {
		user_GenderRepository.AddUserGender(id_user, id_gender);
		return null;
	}

}
