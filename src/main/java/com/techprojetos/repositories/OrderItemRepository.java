package com.techprojetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprojetos.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
