package com.example.h2zoo;

import com.example.h2zoo.models.Bird;
import com.example.h2zoo.models.Reptile;
import com.example.h2zoo.repositories.BirdRepo;
import com.example.h2zoo.repositories.ReptileRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = SpringApplication.run(H2ZooApplication.class, args);
		ReptileRepo myReptileRepo = app.getBean(ReptileRepo.class);
		BirdRepo myBirdRepo = app.getBean(BirdRepo.class);
		Reptile kingCobra = new Reptile("Slither","Snake","Various","Carnivore");
		Reptile komodoDragon = new Reptile("Dennis","Lizard","Brown","Carnivore");
		ArrayList<Reptile> myReptilelist = new ArrayList<>();
		myReptilelist.add(kingCobra);
		myReptilelist.add(komodoDragon);
		myReptileRepo.save(new Reptile("Bob", "Salamander","Various", "Omnivorous"));
		myReptileRepo.saveAll(myReptilelist);
		Bird cardinal = new Bird("Nancy","Robin","Red","Omnivorous", false);
		myBirdRepo.save(cardinal);
		System.out.println();
		System.out.println("Reptiles in db: " + myReptileRepo.count());
		System.out.println("Birds in db: " + myBirdRepo.count());
	}
}
