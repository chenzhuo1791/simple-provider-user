package com.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring.dao")
public class SimpleApplication {


	public static void main(String[] args){
		SpringApplication.run(SimpleApplication.class, args);
	}

}
