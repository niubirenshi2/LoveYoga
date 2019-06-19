package org.team3.loveyoga.init;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.team3.loveyoga.controller",
				"org.team3.loveyoga.service",
				"org.team3.loveyoga.configuration"})
@MapperScan("org.team3.loveyoga.dao")
public class LoveYogaApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoveYogaApplication.class, args);
	}

}
