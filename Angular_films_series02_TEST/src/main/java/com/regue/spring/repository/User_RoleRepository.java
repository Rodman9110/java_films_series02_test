package com.regue.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.User_Role;

public interface User_RoleRepository extends JpaRepository<User_Role, Integer>{
	
	@Modifying
	@Query(value = "INSERT INTO User_Role (id_user,id_role) VALUES (:id_user,:id_role)", nativeQuery = true)
	@Transactional
	void AddUserRole(@Param("id_user") int id_user, @Param("id_role") int id_role);


}
