package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Gender;
import com.regue.spring.repository.GenderRepository;

@Service("GenderService")
public class GenderServiceImpl implements GenderService{
	
	@Autowired
	GenderRepository genderRepository;

	@Override
	public List<Gender> listar() {
		// TODO Auto-generated method stub
		return genderRepository.findAll();
	}

	@Override
	public Optional<Gender> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gender add(Gender g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gender edit(Gender g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gender delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gender getUserGender(int id_user) {
		// TODO Auto-generated method stub
		return null;
	}

}
