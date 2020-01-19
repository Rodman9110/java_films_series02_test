package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actors_country")
public class Actors_Country {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_actor;
	private int id_country;
	
	
	public Actors_Country() {
		// TODO Auto-generated constructor stub
	}


	public Actors_Country(int id, int id_actor, int id_country) {
		super();
		this.id = id;
		this.id_actor = id_actor;
		this.id_country = id_country;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getId_actor() {
		return id_actor;
	}


	public void setId_actor(int id_actor) {
		this.id_actor = id_actor;
	}


	public int getId_country() {
		return id_country;
	}


	public void setId_country(int id_country) {
		this.id_country = id_country;
	}
	

}
