package com.regue.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regue.spring.model.Companies;


public interface CompaniesRepository extends JpaRepository<Companies, Integer>{

}
