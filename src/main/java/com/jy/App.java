package com.jy;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScans(value = {@MapperScan("com.jy.mapper")})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
