package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Comment;
import com.regue.spring.repository.CommentRepository;
@Service("CommentServices")
public class CommentServicesImpl implements CommentServices {
	
	@Autowired
	CommentRepository commentRepository;

	@Override
	public List<Comment> listar() {
		// TODO Auto-generated method stub
		return commentRepository.findAll();
	}

	@Override
	public Optional<Comment> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment add(Comment c) {
		// TODO Auto-generated method stub
		return commentRepository.save(c);
	}

	@Override
	public Comment edit(Comment c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
