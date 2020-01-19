package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="film_classification")
public class Film_Classification {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_film;
	private int id_classification;
	
	public Film_Classification() {
		// TODO Auto-generated constructor stub
	}

	public Film_Classification(int id, int id_film, int id_classification) {
		
		this.id = id;
		this.id_film = id_film;
		this.id_classification = id_classification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_film() {
		return id_film;
	}

	public void setId_film(int id_film) {
		this.id_film = id_film;
	}

	public int getId_classification() {
		return id_classification;
	}

	public void setId_classification(int id_classification) {
		this.id_classification = id_classification;
	}
	
	
}
