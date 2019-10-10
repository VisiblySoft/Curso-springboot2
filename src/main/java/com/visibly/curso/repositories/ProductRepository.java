package com.visibly.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visibly.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
