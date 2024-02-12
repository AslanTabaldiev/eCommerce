package com.example.eCommerce.Repository;

import com.example.eCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long > {
    Optional<Object> findBySKU(String sku);
}
