package com.regue.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regue.spring.model.Comment;

public interface CommentRepository  extends JpaRepository<Comment, Integer>{

}
