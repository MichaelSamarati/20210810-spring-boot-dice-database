package com.example.dice;

import com.example.dice.model.Dice;
import com.example.dice.repository.DiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.awt.*;

@SpringBootApplication
public class DiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiceApplication.class, args);
	}
/*
	@Bean
	public CommandLineRunner demo(DiceRepository repository) {
		return (args) -> {
			repository.save(new Dice("red", 2));
			repository.save(new Dice("red", 5));
			repository.save(new Dice("orange", 4));
			repository.save(new Dice("green", 5));
			repository.save(new Dice("blue", 1));
		};
	}*/

}
