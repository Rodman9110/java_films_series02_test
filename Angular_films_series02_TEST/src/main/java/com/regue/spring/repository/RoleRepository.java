package com.regue.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.regue.spring.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	@Query("SELECT r FROM Role r WHERE r.id = ?1")
	List<Role> FindRoleId(int id_role);

}
