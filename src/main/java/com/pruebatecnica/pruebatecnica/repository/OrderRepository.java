package com.pruebatecnica.pruebatecnica.repository;

import com.pruebatecnica.pruebatecnica.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}