package com.ahorcado;

import com.ahorcado.infra.console.ConsoleReader;
import com.ahorcado.repository.impl.AhorcadoRepository;
import com.ahorcado.service.impl.AhorcadoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AhorcadoApplication {


	public static void main(String[] args) {
		SpringApplication.run(AhorcadoApplication.class, args);
		ConsoleReader consoleReader=new ConsoleReader(new AhorcadoService(new AhorcadoRepository()));
		consoleReader.Init();
	}

}
