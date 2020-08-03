package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="film_companies")
public class Film_Companies {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String film;
	private Boolean companies;

	
	public Film_Companies() {
		// TODO Auto-generated constructor stub
	}


	public Film_Companies(int id, String film, Boolean companies) {
		
		this.id = id;
		this.film = film;
		this.companies = companies;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFilm() {
		return film;
	}


	public void setFilm(String film) {
		this.film = film;
	}


	public Boolean getCompanies() {
		return companies;
	}


	public void setCompanies(Boolean companies) {
		this.companies = companies;
	}
	
	
	
	


}