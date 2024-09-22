package com.promad.test.processo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.promad.test.processo.entities.User;
import com.promad.test.processo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	//dependencia fraca/desaclopada
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Andre Saches Aleida", "Mario Bross", "Marina Silva", "Comarca Santo Andre", "9999", "sa@gmail.com");
		User u2 = new User(null, "Sandro Quintana", "Sabrina Mendes", "Airton Silva", "Comarca Campinas", "9999", "sd@gmail.com");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	

}
