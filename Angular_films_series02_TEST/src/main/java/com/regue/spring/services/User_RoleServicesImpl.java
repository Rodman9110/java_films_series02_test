package com.regue.spring.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.User_Role;
import com.regue.spring.repository.User_RoleRepository;

@Service("User_RoleServices")
public class User_RoleServicesImpl implements User_RoleServices{
	
	@Autowired
	User_RoleRepository user_RoleRepository;

	@Override
	public List<User_Role> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User_Role> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Role add(User_Role u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Role edit(User_Role u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Role delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User_Role addUserRole(int id_user, int id_role) {
		user_RoleRepository.AddUserRole(id_user, id_role);
		return null;
	}

}
