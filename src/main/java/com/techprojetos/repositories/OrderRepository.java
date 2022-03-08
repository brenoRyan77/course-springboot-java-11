package com.techprojetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprojetos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
