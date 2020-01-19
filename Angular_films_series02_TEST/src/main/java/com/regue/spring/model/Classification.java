package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="classification")
public class Classification {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String img_classification;

	public Classification() {
		// TODO Auto-generated constructor stub
	}

	public Classification(int id, String name, String img_classification) {
		
		this.id = id;
		this.name = name;
		this.img_classification = img_classification;
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

	public String getImg_classification() {
		return img_classification;
	}

	public void setImg_classification(String img_classification) {
		this.img_classification = img_classification;
	}
	


	
	
}
