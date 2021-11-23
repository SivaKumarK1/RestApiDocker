package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;

@RestController
public class UserController {
	@Autowired
	UserRepo repo;

	@GetMapping(path = "/allUsers", produces = { "application/json" })
	@ResponseBody
	public List<User> getAllUsers() {
		return repo.findAll();

	}

	@GetMapping(path = "/getUser/{uid}")
	@ResponseBody
	public Optional<User> getUser(@PathVariable("uid") int uid) {
		return repo.findById(uid);

	}

	@DeleteMapping(path = "/delUser/{uid}")
	public String deleteUser(@PathVariable("uid") int uid) {
//		User user= repo.getById(uid);//		
//		repo.delete(user);
//		System.out.println(user);
		System.out.println(uid);
		repo.deleteById(uid);
		return "Deleted";

	}

	@PutMapping(path = "/editUser", consumes = { "application/json" })
	public User saveOrUpdate(@RequestBody User user) {
		repo.save(user);
		System.out.println(user);
		return user;

	}

}
