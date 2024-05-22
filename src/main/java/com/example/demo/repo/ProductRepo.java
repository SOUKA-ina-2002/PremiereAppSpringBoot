package com.example.demo.repo;

import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {

    // Méthodes utilisant des conventions de nommage
    List<Product> findByNameContains(String name);

    List<Product> findByNameContainsIgnoreCaseAndPriceGreaterThan(String name, Long price);

    /**
     * Pour éviter des noms de méthodes trop longs, on peut utiliser des requêtes HQL.
     */

    @Query("select p from Product p where p.name like %:kw% and p.price > :price")
    List<Product> search(@Param("kw") String name, @Param("price") long price);
}
