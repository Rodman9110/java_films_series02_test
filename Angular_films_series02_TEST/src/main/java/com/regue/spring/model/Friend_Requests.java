package com.regue.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="friend_requests")
public class Friend_Requests {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_user_receiver;
	private int id_user_transmitter;
	private int request_status;
	
	public Friend_Requests() {
		// TODO Auto-generated constructor stub
	}

	public Friend_Requests(int id, int id_user_receiver, int id_user_transmitter, int request_status) {
	
		this.id = id;
		this.id_user_receiver = id_user_receiver;
		this.id_user_transmitter = id_user_transmitter;
		this.request_status = request_status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_user_receiver() {
		return id_user_receiver;
	}

	public void setId_user_receiver(int id_user_receiver) {
		this.id_user_receiver = id_user_receiver;
	}

	public int getId_user_transmitter() {
		return id_user_transmitter;
	}

	public void setId_user_transmitter(int id_user_transmitter) {
		this.id_user_transmitter = id_user_transmitter;
	}

	public int getRequest_status() {
		return request_status;
	}

	public void setRequest_status(int request_status) {
		this.request_status = request_status;
	}
	
	

}
