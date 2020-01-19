package com.regue.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regue.spring.model.Comment_Film;
import com.regue.spring.model.Comment_Foro;
import com.regue.spring.model.Comment_Mailbox;
import com.regue.spring.services.Comment_FilmServices;
import com.regue.spring.services.Comment_ForoServices;
import com.regue.spring.services.Comment_MailboxServices;

@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping(path = "/comment")
public class AppControllerComments {
	
	@Autowired
	@Qualifier("Comment_ForoServices")
	Comment_ForoServices comment_ForoServices;
	
	@Autowired
	@Qualifier("Comment_FilmServices")
	Comment_FilmServices comment_FilmServices ;
	
	@Autowired
	@Qualifier("Comment_MailboxServices")
	Comment_MailboxServices comment_MailboxServices;
	
	@PostMapping(path="AddCommentForo")
	public Comment_Foro postCommentForo(@RequestBody Comment_Foro comment_foro) {
		System.out.println( comment_foro + " ESTOY EN AÑADIR COMMMENT FORO Controlador 2");
		return comment_ForoServices.add(comment_foro);
	}
	@GetMapping(path="getAllCommentsForo")
	public List<Comment_Foro> getAllCommentForo(){
		return comment_ForoServices.getAllcommetsForo();
	}
	
	@PostMapping(path="AddCommentsFilm")
	public Comment_Film postCommentFilm(@RequestBody Comment_Film comment) {
		System.err.println( comment + " comment film Dentro");
		comment_FilmServices.add(comment);
		return null;
	}
	@GetMapping(path={"commentsFilm/{id_film}"})
	public List<Comment_Film> getCommentFilm(@PathVariable("id_film") int id_film){
		System.err.println("Buscar por id comment film");
		return comment_FilmServices.FindCommentFilm(id_film);	
	}
	@GetMapping(path= {"getMyCommentMailbox/{email}"})
	public List<Comment_Mailbox> getMyCommentMailbox(@PathVariable("email") String email){
		return comment_MailboxServices.getMyCommentMailbox(email);
	}
	@PostMapping(path="postCommentMailbox")
	public Comment_Mailbox postCommentMailbox(@RequestBody Comment_Mailbox comment_Mailbox) {
		return comment_MailboxServices.add(comment_Mailbox);
	}
	

}
