package com.example.demo.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Dateconfig {
	@Bean
	public LocalTime generateTime() {
		return LocalTime.now();
	}

}
