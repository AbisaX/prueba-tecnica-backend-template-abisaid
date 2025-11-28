package com.pruebatecnica.pruebatecnica.repository;

import com.pruebatecnica.pruebatecnica.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}