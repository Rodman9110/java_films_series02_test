package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.User_Country;
import com.regue.spring.repository.User_CountryRepository;

@Service("User_CountryServices")
public class User_CountryServicesImpl implements User_CountryServices{
	
	@Autowired
	User_CountryRepository user_CountryRepository;

	@Override
	public List<User_Country> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User_Country> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Country add(User_Country u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Country edit(User_Country u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Country delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Country addUserCountry(int id_user, int id_country) {
		user_CountryRepository.AddUserCountry(id_user, id_country);
		return null;
	}

}
