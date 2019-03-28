package com.zdr.demo.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@EnableSwagger2
@MapperScan("com.zdr.demo.service")
@SpringBootApplication
public class DemoMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMainApplication.class, args);
	}

}
