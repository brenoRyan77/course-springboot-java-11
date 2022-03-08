package com.techprojetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprojetos.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
