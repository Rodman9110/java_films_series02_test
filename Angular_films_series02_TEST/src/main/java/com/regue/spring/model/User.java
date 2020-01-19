package com.regue.spring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String first_name ;
	private String last_name;
	private String email;
	private String password;
	private int id_country;
	private String img_profile;
	private Date date_user;
	private int id_role;
	private int id_gender;
	
	
	public User() {
		
	}


	public User(int id, String first_name, String last_name, String email, String password, int id_country,
			String img_profile, Date date_user, int id_role, int id_gender) {
		
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.id_country = id_country;
		this.img_profile = img_profile;
		this.date_user = date_user;
		this.id_role = id_role;
		this.id_gender = id_gender;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getId_country() {
		return id_country;
	}


	public void setId_country(int id_country) {
		this.id_country = id_country;
	}


	public String getImg_profile() {
		return img_profile;
	}


	public void setImg_profile(String img_profile) {
		this.img_profile = img_profile;
	}


	public Date getDate_user() {
		return date_user;
	}


	public void setDate_user(Date date_user) {
		this.date_user = date_user;
	}


	public int getId_role() {
		return id_role;
	}


	public void setId_role(int id_role) {
		this.id_role = id_role;
	}


	public int getId_gender() {
		return id_gender;
	}


	public void setId_gender(int id_gender) {
		this.id_gender = id_gender;
	}
	
	
	
}
