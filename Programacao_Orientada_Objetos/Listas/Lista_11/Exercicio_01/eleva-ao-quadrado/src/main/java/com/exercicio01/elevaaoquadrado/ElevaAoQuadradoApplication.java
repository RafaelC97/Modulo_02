package com.exercicio01.elevaaoquadrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/eleva-ao-quadrado")

public class ElevaAoQuadradoApplication {

	@GetMapping("/{numero}")
	public  double numeroAoQuadrado(@PathVariable double numero){
		return numero*numero;
	}

	public static void main(String[] args) {
		SpringApplication.run(ElevaAoQuadradoApplication.class, args);
	}

}
