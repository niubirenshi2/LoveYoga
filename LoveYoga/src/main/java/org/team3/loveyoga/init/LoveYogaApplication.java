package org.team3.loveyoga.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.team3.loveyoga.controller")
public class LoveYogaApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoveYogaApplication.class, args);
	}

}
