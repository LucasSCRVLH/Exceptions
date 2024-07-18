package com.poo.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionApplication.class, args);
		
		Exercicio4 exercicio = new Exercicio4();
	exercicio.ex4();
	
	
}
 }