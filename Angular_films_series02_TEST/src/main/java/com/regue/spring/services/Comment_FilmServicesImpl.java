package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Comment_Film;
import com.regue.spring.repository.Comment_FilmRepository;

@Service("Comment_FilmServices")
public class Comment_FilmServicesImpl implements Comment_FilmServices {
	
	@Autowired
	Comment_FilmRepository Comment_FilmRepository;

	@Override
	public List<Comment_Film> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Comment_Film> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment_Film> FindCommentFilm(int id_film) {
		// TODO Auto-generated method stub
		return Comment_FilmRepository.findCommentFilm(id_film);
	}

	@Override
	public Comment_Film add(Comment_Film cf) {
		// TODO Auto-generated method stub
		return Comment_FilmRepository.save(cf);
	}

	@Override
	public Comment_Film edit(Comment_Film cf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment_Film delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
