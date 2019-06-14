package com.bridgelabz.fundonoteapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication

public class FundoNoteAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundoNoteAppApplication.class, args);
	}
}
