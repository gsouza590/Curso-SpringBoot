package com.projetweb.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetweb.course.entities.User;

// nao há necessidade de implementacao, pois ja vem no padrao
public interface UserRepository extends JpaRepository<User, Long> {



}
