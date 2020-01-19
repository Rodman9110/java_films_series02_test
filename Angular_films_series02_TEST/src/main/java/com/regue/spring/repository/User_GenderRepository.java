package com.regue.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.User_Gender;

public interface User_GenderRepository extends JpaRepository<User_Gender, Integer> {
	
	@Modifying
	@Query(value = "INSERT INTO User_Gender (id_user,id_gender) VALUES (:id_user,:id_gender)", nativeQuery = true)
	@Transactional
	void AddUserGender(@Param("id_user") int id_user, @Param("id_gender") int id_gender);

}
