package com.manar.membre;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.manar.membre.entities.Membre;
import com.manar.membre.service.MembreService;

@SpringBootApplication
public class MembreApplication implements CommandLineRunner {
@Autowired
MembreService membreService;
public static void main(String[] args) {
SpringApplication.run(MembreApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
	membreService.saveMembre(new Membre("loujy", (long) 2, new Date()));
	membreService.saveMembre(new Membre("papa", (long) 2, new Date()));
	membreService.saveMembre(new Membre(" maman", (long) 9, new Date()));
}
}