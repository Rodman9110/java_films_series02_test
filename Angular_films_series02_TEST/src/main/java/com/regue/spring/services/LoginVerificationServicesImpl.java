package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.regue.spring.model.User;
import com.regue.spring.repository.UserRepository;

@Service("LoginVerificationServices")
public class LoginVerificationServicesImpl implements LoginVerificationServices {
	
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
	public User delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findLogin(String email, String password) {
		
		return userRepository.findLogin(email, password);
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
	
	

}
