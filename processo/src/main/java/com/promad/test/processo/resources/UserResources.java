package com.promad.test.processo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promad.test.processo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
    @GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Andre Saches Aleida", "Mario Bross", "Marina Silva", "Comarca Santo Andre", "9999", "sa@gmail.com");
		return ResponseEntity.ok().body(u);
				}
}
