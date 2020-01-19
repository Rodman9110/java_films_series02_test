package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Film_Like;
import com.regue.spring.repository.Film_LikeRepository;

@Service("Film_LikesServices")
public class Film_LikesServicesImpl implements Film_LikesServices{
	
	@Autowired
	Film_LikeRepository film_LikeRepository;

	@Override
	public List<Film_Like> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Film_Like> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film_Like> FindFilmLikes(int id_like) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Like add(Film_Like l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Like edit(Film_Like l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film_Like delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getCountFilmLikes(int id_film) {
		
		return film_LikeRepository.getCountFilmLikes(id_film);
	}

	@Override
	public Film_Like postFilmLike(int id_user, int id_film) {
		film_LikeRepository.AddFilmLikes(id_user, id_film);
		return null;
	}
	@Override
	public List<Film_Like> getCountAllFilmLike() {
		
		return null;
	}

	@Override
	public Film_Like findFilmLikes(int id_user, int id_film) {
		// TODO Auto-generated method stub
		return film_LikeRepository.findFilmLikes(id_user, id_film);
	}

	@Override
	public Film_Like DeleteFilmLike(int id_user, int id_film) {
		film_LikeRepository.DeleteFilmLikes(id_user, id_film);
		return null;
	}

}
