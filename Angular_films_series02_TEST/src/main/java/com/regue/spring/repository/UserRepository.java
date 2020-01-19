package com.regue.spring.repository;


import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.regue.spring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("SELECT u FROM User u where u.email = ?1 and u.password= ?2")
	public User findLogin(String email, String password);
	
	@Query("SELECT u FROM User u where u.email = ?1")
	User findUserForEmail(String email);
	
	@Query("SELECT u.id FROM User u where u.email = ?1")
	int findUserIdForEmail(String email);
	
	
	@Modifying
	@Query(value = "INSERT INTO User (first_name,last_name,email,password,id_country,img_profile,date_user,id_role,id_gender) VALUES (:first_name,:last_name,:email,:password,:id_country,:img_profile,:date_user,:id_role,:id_gender)", nativeQuery = true)
	@Transactional
	void addUserRegister(
			@Param("first_name") String first_name,
			@Param("last_name") String last_name, 
			@Param("email") String email,
			@Param("password") String password,
			@Param("id_country") int id_country,			
			@Param("img_profile") String img_profile,
			@Param("date_user") Date date_user, 
			@Param("id_role") int id_role,
			@Param("id_gender") int id_gender);
	
	@Query("SELECT u FROM User u WHERE u.id  NOT IN(?1)")
	List<User> getAllUserNotAdded (int id_user);

}
