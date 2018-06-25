package com.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatis.dao.*")
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication application =  new SpringApplication(AppApplication.class);
		application.run(args);
		application.setBannerMode(Banner.Mode.OFF);
	}
}
