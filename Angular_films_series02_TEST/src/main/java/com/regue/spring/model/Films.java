package com.regue.spring.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="films")
public class Films {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name ;
	private String description;
	private String date_premiere;
	private Date date_film;
	private int id_genres;
	private int id_country;
	private int id_classification;
	private String poster_film;
	private String classification;
	private String trailer;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="film_genres",joinColumns = @JoinColumn(name = "id_film"), 
	inverseJoinColumns = @JoinColumn(name = "id_genres"))
	
	
	private Set<Genres> genres;
	
	public Films() {
		// TODO Auto-generated constructor stub
	}

	public Films(int id, String name, String description, String date_premiere, Date date_film, int id_genres,
			int id_country, int id_classification, String poster_film, String classification, String trailer,
			Set<Genres> genres) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.date_premiere = date_premiere;
		this.date_film = date_film;
		this.id_genres = id_genres;
		this.id_country = id_country;
		this.id_classification = id_classification;
		this.poster_film = poster_film;
		this.classification = classification;
		this.trailer = trailer;
		this.genres = genres;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate_premiere() {
		return date_premiere;
	}

	public void setDate_premiere(String date_premiere) {
		this.date_premiere = date_premiere;
	}

	public Date getDate_film() {
		return date_film;
	}

	public void setDate_film(Date date_film) {
		this.date_film = date_film;
	}

	public int getId_genres() {
		return id_genres;
	}

	public void setId_genres(int id_genres) {
		this.id_genres = id_genres;
	}

	public int getId_country() {
		return id_country;
	}

	public void setId_country(int id_country) {
		this.id_country = id_country;
	}

	public int getId_classification() {
		return id_classification;
	}

	public void setId_classification(int id_classification) {
		this.id_classification = id_classification;
	}

	public String getPoster_film() {
		return poster_film;
	}

	public void setPoster_film(String poster_film) {
		this.poster_film = poster_film;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public Set<Genres> getGenres() {
		return genres;
	}

	public void setGenres(Set<Genres> genres) {
		this.genres = genres;
	}
	
	
	
	
	
}
