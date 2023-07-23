package com.example.obrest;

import com.example.obrest.entity.Laptop;
import com.example.obrest.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObRestApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObRestApplication.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		// crear Laptops

		Laptop laptop1 = new Laptop(null,"E12","Vaio",480,8);
		Laptop laptop2 = new Laptop(null,"Pro","Macbook",480,16);

		//Guardar Laptops
		repository.save(laptop1);
		repository.save(laptop2);

		System.out.println("Numero de laptops almacenados: " + repository.findAll().size());
	}

}
