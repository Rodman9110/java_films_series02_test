package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="my_films")
public class My_Films {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_user;
	private int id_film;
	
	
	public My_Films() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public My_Films(int id, int id_user, int id_film) {
		
		this.id = id;
		this.id_user = id_user;
		this.id_film = id_film;
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



	public int getId_film() {
		return id_film;
	}



	public void setId_film(int id_film) {
		this.id_film = id_film;
	}
	
	
	
	

}
