package com.example.demo;

import com.example.demo.entities.Product;
import com.example.demo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepo.save(new Product(56, "laptop", 4545.0, 53));
		productRepo.save(new Product(56, "Telephone", 1545.0, 20));
		//List<Product> p=productRepo.findAll();
		List<Product> products=productRepo.findAll();
		products.forEach(p->{
			System.out.println(p.getName());
			System.out.println(p.getPrice());
			System.out.println(p.getQuantity());
			System.out.println("-----------------");
		});

		List<Product> lap=productRepo.findByNameContains("lap");
		lap.forEach(product -> {
			System.out.println(product.getName());
		});

	}
}
