package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContoller
{
	@Autowired
	DaoInterface dao;
	@GetMapping()
	public ResponseEntity<List<User>> getEmployees(User user)
	{
		return null;
	//	return new ResponseEntity<List<User>>null dao.findAll();
	}
}
