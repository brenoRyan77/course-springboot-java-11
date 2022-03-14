package com.techprojetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprojetos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
