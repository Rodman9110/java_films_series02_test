package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="film_genres")
public class Film_Genres {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_film;
	private int id_genres;
	
	public Film_Genres() {
		
	}

	public Film_Genres(int id, int id_film, int id_genres) {
		
		this.id = id;
		this.id_film = id_film;
		this.id_genres = id_genres;
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

	public int getId_genres() {
		return id_genres;
	}

	public void setId_genres(int id_genres) {
		this.id_genres = id_genres;
	}
	
	

}
