package com.regue.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.Companies;
import com.regue.spring.repository.CompaniesRepository;

@Service("CompaniesServices")
public class CompaniesServicesImpl implements CompaniesServices{

	@Autowired
	CompaniesRepository companiesRepository;
	
	public List<Companies> listar(){
		// TODO Auto-generated method stub
		return companiesRepository.findAll();
	}

}
