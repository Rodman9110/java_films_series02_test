package com.regue.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regue.spring.model.Gender;

public interface GenderRepository  extends JpaRepository<Gender, Integer>{

}
