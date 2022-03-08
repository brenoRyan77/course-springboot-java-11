package com.techprojetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprojetos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
