package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Gender;

public interface GenderService {
	

	List<Gender>listar();
	Optional<Gender> listarId(int id);
	Gender add(Gender g);
	Gender edit(Gender g);
	Gender delete(int id);
	Gender getUserGender(int id_user);

}
