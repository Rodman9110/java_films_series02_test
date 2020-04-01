package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Role;
import com.regue.spring.repository.RoleRepository;

@Service("RoleServices")
public class RoleServicesImpl implements RoleServices{
	
	@Autowired
	RoleRepository roleRepository;

	@Override
	public List<Role> listar() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Optional<Role> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role add(Role g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role edit(Role g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getUserRole(int id_user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> FindRoleId(int id_role) {
		// TODO Auto-generated method stub
		return roleRepository.FindRoleId(id_role);
	}

}
