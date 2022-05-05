package com.project.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.project")
@RestController
public class Application {

	@Autowired
	private LibraryApplication application;


	@GetMapping("/mensaje/")
	public String mensaje(
			@RequestParam("mensaje") String mensaje) {
		return application.mensaje(mensaje);
	}



	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
