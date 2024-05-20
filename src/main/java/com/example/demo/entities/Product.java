package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
//au lieu de generer les constructeurs et les getters et setters on utilise Lombok
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name ;
    private double price ;
    private int quantity;
}
