package com.regue.spring.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.Film_Genres;
import com.regue.spring.model.User_Country;

public interface User_CountryRepository  extends JpaRepository<User_Country, Integer>{
	
	@Modifying
	@Query(value = "INSERT INTO User_Country (id_user,id_country) VALUES (:id_user,:id_country)", nativeQuery = true)
	@Transactional
	void AddUserCountry(@Param("id_user") int id_user, @Param("id_country") int id_country);

	
}
