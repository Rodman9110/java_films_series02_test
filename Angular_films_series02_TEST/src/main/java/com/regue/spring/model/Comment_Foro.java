package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment_foro")
public class Comment_Foro {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_user;
	private String name ;
	private String text;
	private String img_profile;
	private String email;
	
	public Comment_Foro() {
	
	}

	public Comment_Foro(int id, int id_user, String name, String text, String img_profile, String email) {

		this.id = id;
		this.id_user = id_user;
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

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
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
