package com.techprojetos.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprojetos.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Breno Ryan", "breno@gmail.com", "987443053", "123456");
		return ResponseEntity.ok().body(u);
	}
	
}
