package com.visibly.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visibly.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
