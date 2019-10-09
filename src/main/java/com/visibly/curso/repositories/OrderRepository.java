package com.visibly.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visibly.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
