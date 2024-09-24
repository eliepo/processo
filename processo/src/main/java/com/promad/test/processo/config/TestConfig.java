package com.promad.test.processo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.promad.test.processo.entities.Reu;
import com.promad.test.processo.entities.User;
import com.promad.test.processo.repositories.ReuRepository;
import com.promad.test.processo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	//dependencia fraca/desaclopada
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ReuRepository reuRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Andre Saches Aleida", "Mario Bross", "Marina Silva", "Comarca Santo Andre", "9999", "sa@gmail.com");
		User u2 = new User(null, "Sandro Quintana", "Sabrina Mendes", "Airton Silva", "Comarca Campinas", "9999", "sd@gmail.com");
		
		Reu o1 = new Reu(null, Instant.parse("2019-06-20T19:53:07Z"), "Jõao da Penha", u1);
		Reu o2 = new Reu(null, Instant.parse("2019-07-21T03:42:10Z"), "Marcos Paíva",u2);
		Reu o3 = new Reu(null, Instant.parse("2019-07-22T15:21:22Z"), "Luiz Datena",u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		reuRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}
	
	

}
