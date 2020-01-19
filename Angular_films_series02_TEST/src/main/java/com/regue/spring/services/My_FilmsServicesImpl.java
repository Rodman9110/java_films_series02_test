package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Films;
import com.regue.spring.model.My_Films;
import com.regue.spring.repository.My_FilmsRepository;


@Service("My_FilmsServices")
public class My_FilmsServicesImpl implements My_FilmsServices{
	
	@Autowired
	My_FilmsRepository my_FilmsRepository;

	@Override
	public List<My_Films> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<My_Films> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public My_Films add(My_Films u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public My_Films edit(My_Films u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public My_Films delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountMyFilmsUser(int id_user) {
		// TODO Auto-generated method stub
		return my_FilmsRepository.getCountMyFilmsUser(id_user);
	}

	@Override
	public My_Films DeleteMyFilm(int id_user, int id_film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public My_Films postMyFavoriteFilm(int id_user, int id_film) {
		my_FilmsRepository.AddMyFavoriteFilm(id_user, id_film);
		return null;
	}

	@Override
	public My_Films getMyFavoriteFilm(int id_user, int id_film) {
		// TODO Auto-generated method stub
		return my_FilmsRepository.getMyFavoriteFilm(id_user, id_film);
	}

	@Override
	public List<Films> getAllMyFilms(int id_user) {
		// TODO Auto-generated method stub
		return my_FilmsRepository.getAllMyFilms(id_user);
	}

	@Override
	public My_Films DeleteMyFavoriteFilm(int id_user, int id_film) {
		my_FilmsRepository.DeleteMyFavoriteFilm(id_user, id_film);
		return null;
	}

	
}
