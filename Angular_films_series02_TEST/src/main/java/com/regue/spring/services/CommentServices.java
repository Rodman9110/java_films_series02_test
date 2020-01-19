package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Comment;


public interface CommentServices {
	
	
	List<Comment>listar();
	Optional<Comment> listarId(int id);
	Comment add(Comment c);
	Comment edit(Comment c);
	Comment delete(int id);

}
