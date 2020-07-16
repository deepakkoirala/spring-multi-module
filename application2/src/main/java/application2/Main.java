package application2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import application2.Main;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@ComponentScan("common")
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}