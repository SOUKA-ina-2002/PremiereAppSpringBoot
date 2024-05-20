package com.example.demo.repo;

import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository est une interface generique de spring data
public interface ProductRepo extends JpaRepository<Product,Long> {
}
