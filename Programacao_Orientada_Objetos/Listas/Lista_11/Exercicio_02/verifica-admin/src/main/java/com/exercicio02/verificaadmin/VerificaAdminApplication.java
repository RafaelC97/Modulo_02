package com.exercicio02.verificaadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/login")

public class VerificaAdminApplication {

	@GetMapping("/{user}")
	public boolean verificaAdmin(@PathVariable String user){
		return user.equals("admin");
	}

	public static void main(String[] args) {
		SpringApplication.run(VerificaAdminApplication.class, args);
	}

}
