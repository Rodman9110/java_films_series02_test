package com.regue.spring.services;

import java.util.List;
import java.util.Optional;

import com.regue.spring.model.Comment_Mailbox;

public interface Comment_MailboxServices {
	
	List<Comment_Mailbox>listar();
	Optional<Comment_Mailbox> listarId(int id);
	Comment_Mailbox add(Comment_Mailbox cm);
	Comment_Mailbox edit(Comment_Mailbox cm);
	Comment_Mailbox delete(int id);
	List<Comment_Mailbox> getMyCommentMailbox(String email);

}
