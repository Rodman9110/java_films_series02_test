package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Films;
import com.regue.spring.model.My_Films;


public interface My_FilmsServices {
	
	List<My_Films>listar();
	Optional<My_Films> listarId(int id);
	My_Films add(My_Films u);
	My_Films edit(My_Films u);
	My_Films delete(int id);
	int getCountMyFilmsUser(int id_user);
	My_Films DeleteMyFilm(int id_user,int id_film);
	My_Films postMyFavoriteFilm(int id_user,int id_film);
	My_Films getMyFavoriteFilm(int id_user,int id_film);
	List<Films>getAllMyFilms(int id_user);
	My_Films DeleteMyFavoriteFilm(int id_user,int id_film);
	
}
