package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment_film")
public class Comment_Film {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_film;
	private String name ;
	private String text;
	private String img_profile;
	private String email;
	
	Comment_Film(){
		
	}

	public Comment_Film(int id, int id_film, String name, String text, String img_profile, String email) {
		
		this.id = id;
		this.id_film = id_film;
		this.name = name;
		this.text = text;
		this.img_profile = img_profile;
		this.email = email;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImg_profile() {
		return img_profile;
	}

	public void setImg_profile(String img_profile) {
		this.img_profile = img_profile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
