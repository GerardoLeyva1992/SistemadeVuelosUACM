package edu.uacm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.uacm.domain.Empleado;
import edu.uacm.domain.EmpleadoRepository;

@SpringBootApplication
public class Application  {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
