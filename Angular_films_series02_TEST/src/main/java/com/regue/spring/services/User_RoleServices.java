package com.regue.spring.services;


import java.util.List;
import java.util.Optional;
import com.regue.spring.model.User_Role;

public interface User_RoleServices {
	
	List<User_Role>listar();
	Optional<User_Role> listarId(int id);
	User_Role add(User_Role u);
	User_Role edit(User_Role u);
	User_Role delete(int id);
	User_Role addUserRole(int id_user,int id_role);
}
