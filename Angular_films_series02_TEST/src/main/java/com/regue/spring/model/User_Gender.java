package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_gender")
public class User_Gender {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_user;
	private int id_gender;
	
	public User_Gender() {
		// TODO Auto-generated constructor stub
	}

	public User_Gender(int id, int id_user, int id_gender) {
		
		this.id = id;
		this.id_user = id_user;
		this.id_gender = id_gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_gender() {
		return id_gender;
	}

	public void setId_gender(int id_gender) {
		this.id_gender = id_gender;
	}
	
	

}
