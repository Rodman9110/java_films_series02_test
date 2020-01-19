package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Comment_Foro;
import com.regue.spring.repository.Comment_ForoRepository;



@Service("Comment_ForoServices")
public class Comment_ForoServicesImpl implements Comment_ForoServices {
	
	@Autowired
	Comment_ForoRepository comment_ForoRepository;

	@Override
	public List<Comment_Foro> listar() {
		// TODO Auto-generated method stub
		return comment_ForoRepository.findAll();
	}

	@Override
	public Optional<Comment_Foro> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment_Foro add(Comment_Foro cf) {
		// TODO Auto-generated method stub
		return comment_ForoRepository.save(cf);
	}

	@Override
	public Comment_Foro edit(Comment_Foro cf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment_Foro delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment_Foro> getAllcommetsForo() {
		// TODO Auto-generated method stub
		return comment_ForoRepository.getAllCommentsForo();
	}

}
