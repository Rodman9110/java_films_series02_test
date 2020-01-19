package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actors_film")
public class Actors_Film {
	

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_actor;
	private int id_film;
	
	public Actors_Film() {
		
	}

	public Actors_Film(int id, int id_actor, int id_film) {
		this.id = id;
		this.id_actor = id_actor;
		this.id_film = id_film;
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

	public int getId_film() {
		return id_film;
	}

	public void setId_film(int id_film) {
		this.id_film = id_film;
	}
	
	
	

}
