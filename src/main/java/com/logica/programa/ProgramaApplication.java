package com.logica.programa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgramaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramaApplication.class, args);

		ListaExercicio3 list = new ListaExercicio3();
		list.exercicio1();
	}

}
