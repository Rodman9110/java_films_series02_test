package com.regue.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regue.spring.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
