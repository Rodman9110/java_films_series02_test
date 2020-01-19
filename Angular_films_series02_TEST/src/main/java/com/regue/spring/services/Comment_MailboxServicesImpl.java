package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Comment_Mailbox;
import com.regue.spring.repository.Comment_MailboxRepository;

@Service("Comment_MailboxServices")
public class Comment_MailboxServicesImpl implements Comment_MailboxServices{

	@Autowired
	Comment_MailboxRepository comment_MailboxRepository;
	
	@Override
	public List<Comment_Mailbox> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Comment_Mailbox> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment_Mailbox add(Comment_Mailbox cm) {
		// TODO Auto-generated method stub
		return comment_MailboxRepository.save(cm);
	}

	@Override
	public Comment_Mailbox edit(Comment_Mailbox cm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment_Mailbox delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment_Mailbox> getMyCommentMailbox(String email) {
		// TODO Auto-generated method stub
		return comment_MailboxRepository.getMyCommentMailbox(email);
	}

}
