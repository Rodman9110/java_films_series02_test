package com.regue.spring.services;

import java.util.List;
import java.util.Optional;


import com.regue.spring.model.Comment_Foro;

public interface Comment_ForoServices {
	
	List<Comment_Foro>listar();
	Optional<Comment_Foro> listarId(int id);
	Comment_Foro add(Comment_Foro cf);
	Comment_Foro edit(Comment_Foro cf);
	Comment_Foro delete(int id);
	List<Comment_Foro> getAllcommetsForo();
}
