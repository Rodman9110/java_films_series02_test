package com.regue.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.regue.spring.model.Comment_Mailbox;

public interface Comment_MailboxRepository extends JpaRepository<Comment_Mailbox, Integer>{
	
	
	@Query("SELECT c FROM Comment_Mailbox c WHERE c.email_receiver = ?1")
	List<Comment_Mailbox> getMyCommentMailbox(String email);

}
