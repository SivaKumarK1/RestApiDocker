package com.example.demo.dao;

 

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	 

}

//<dependency>
//<groupId>com.h2database</groupId>
//<artifactId>h2</artifactId>
//<scope>runtime</scope>
//</dependency>