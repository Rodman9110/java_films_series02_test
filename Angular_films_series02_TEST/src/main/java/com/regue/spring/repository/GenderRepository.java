package com.regue.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.regue.spring.model.Gender;

public interface GenderRepository  extends JpaRepository<Gender, Integer>{
	
	
	@Query("SELECT g FROM Gender g WHERE g.id = ?1")
	List<Gender> FindGenderId(int id_gender);

}
