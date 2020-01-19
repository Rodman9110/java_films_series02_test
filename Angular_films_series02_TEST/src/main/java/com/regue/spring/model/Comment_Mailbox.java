package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment_mailbox")
public class Comment_Mailbox {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_transmitter;
	private int id_receiver;
	private String text;
	private String name_transmitter;
	private String name_receiver;
	private String img_user_transmitter;
	private String email_transmitter;
	private String email_receiver;
	
	public Comment_Mailbox() {
		// TODO Auto-generated constructor stub
	}
	
	public Comment_Mailbox(int id, int id_transmitter, int id_receiver, String text, String name_transmitter,
			String name_receiver, String img_user_transmitter, String email_transmitter, String email_receiver) {
		
		this.id = id;
		this.id_transmitter = id_transmitter;
		this.id_receiver = id_receiver;
		this.text = text;
		this.name_transmitter = name_transmitter;
		this.name_receiver = name_receiver;
		this.img_user_transmitter = img_user_transmitter;
		this.email_transmitter = email_transmitter;
		this.email_receiver = email_receiver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_transmitter() {
		return id_transmitter;
	}

	public void setId_transmitter(int id_transmitter) {
		this.id_transmitter = id_transmitter;
	}

	public int getId_receiver() {
		return id_receiver;
	}

	public void setId_receiver(int id_receiver) {
		this.id_receiver = id_receiver;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getName_transmitter() {
		return name_transmitter;
	}

	public void setName_transmitter(String name_transmitter) {
		this.name_transmitter = name_transmitter;
	}

	public String getName_receiver() {
		return name_receiver;
	}

	public void setName_receiver(String name_receiver) {
		this.name_receiver = name_receiver;
	}

	public String getImg_user_transmitter() {
		return img_user_transmitter;
	}

	public void setImg_user_transmitter(String img_user_transmitter) {
		this.img_user_transmitter = img_user_transmitter;
	}

	public String getEmail_transmitter() {
		return email_transmitter;
	}

	public void setEmail_transmitter(String email_transmitter) {
		this.email_transmitter = email_transmitter;
	}

	public String getEmail_receiver() {
		return email_receiver;
	}

	public void setEmail_receiver(String email_receiver) {
		this.email_receiver = email_receiver;
	}
	
	
	
	
	

}
