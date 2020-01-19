package com.regue.spring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actors")
public class Actors {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String img_profile;
	private int id_country;
	private Date date_actor;
	private String details;
	
	public Actors() {
		// TODO Auto-generated constructor stub
	}
	
	public Actors(int id, String name, String img_profile, int id_country, Date date_actor, String details) {
		
		this.id = id;
		this.name = name;
		this.img_profile = img_profile;
		this.id_country = id_country;
		this.date_actor = date_actor;
		this.details = details;
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

	public String getImg_profile() {
		return img_profile;
	}

	public void setImg_profile(String img_profile) {
		this.img_profile = img_profile;
	}

	public int getId_country() {
		return id_country;
	}

	public void setId_country(int id_country) {
		this.id_country = id_country;
	}

	public Date getDate_actor() {
		return date_actor;
	}

	public void setDate_actor(Date date_actor) {
		this.date_actor = date_actor;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
}
