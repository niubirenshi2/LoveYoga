package org.team3.loveyoga.init;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.team3.loveyoga")
@MapperScan("org.team3.loveyoga.Dao")
public class LoveYogaApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoveYogaApplication.class, args);
	}

}
