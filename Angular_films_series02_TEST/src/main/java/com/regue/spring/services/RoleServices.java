package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Role;

public interface RoleServices {
	
	List<Role>listar();
	Optional<Role> listarId(int id);
	Role add(Role g);
	Role edit(Role g);
	Role delete(int id);
	Role getUserRole(int id_user);
	List<Role> FindRoleId(int id_role);


}
