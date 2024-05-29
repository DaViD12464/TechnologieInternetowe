package com.example.demo;

import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	@Transactional
	public CommandLineRunner run(TabelaRepository repository)
	{
		return (args ->
		{
			insertJavaAdvocates(repository);
			System.out.println(repository.findAll());

			System.out.println(repository.findTabelaByval2Containing("N"));
		});

	}


	private void insertJavaAdvocates(TabelaRepository repository) {
		repository.save(new Tabela("Jan", "Nowak"));
		repository.save(new Tabela("Grzegorz", "Brzeczyszczykiewicz"));
		repository.save(new Tabela("Konrad", "Mazowiecki"));
		repository.save(new Tabela("Kamil", "Adamski"));

	}
}


