package com.projetweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetweb.course.entities.User;
import com.projetweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
// Essa classe vai ter que ter uma dependencia para o User Repository para poder acessar o banco de dados
//Importante observar que quando for colocar uma dependencia ela tem que ser fraca.
//No caso do framework ja vem com uma injecao de dependencia implicito

public class TestConfig implements CommandLineRunner{
	
		@Autowired //resolve a injecao de dependencia automatica
		private UserRepository userRepository;

		@Override
		public void run(String... args) throws Exception {
			User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
			User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
			userRepository.saveAll(Arrays.asList(u1, u2));
		}
		
		
}
