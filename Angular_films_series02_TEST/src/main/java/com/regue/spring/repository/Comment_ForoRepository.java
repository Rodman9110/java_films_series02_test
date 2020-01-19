package com.regue.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.regue.spring.model.Comment_Foro;


public interface Comment_ForoRepository  extends JpaRepository<Comment_Foro, Integer>{
	
	@Query("SELECT c FROM Comment_Foro c order by c.id desc")
	public List<Comment_Foro> getAllCommentsForo();
	

}
