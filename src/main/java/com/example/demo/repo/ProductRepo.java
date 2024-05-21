package com.example.demo.repo;

import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {

    //creer des methodes a l'aide de conventions
    public List<Product> findByNameContains(String name);
}
