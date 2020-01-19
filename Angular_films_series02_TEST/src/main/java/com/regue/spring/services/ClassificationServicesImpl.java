package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Classification;
import com.regue.spring.repository.ClassificationRepository;

@Service("ClassificationServices")
public class ClassificationServicesImpl implements ClassificationServices{
	
	@Autowired
	ClassificationRepository classificationRepository;

	@Override
	public List<Classification> listar() {
		// TODO Auto-generated method stub
		return classificationRepository.findAll();
	}

	@Override
	public Optional<Classification> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classification add(Classification c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classification edit(Classification c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classification delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classification getFilmClassification(int id_film) {
		// TODO Auto-generated method stub
		return classificationRepository.getFilmClassification(id_film);
	}

}
