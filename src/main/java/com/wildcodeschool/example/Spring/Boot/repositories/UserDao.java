package com.wildcodeschool.example.Spring.Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.example.Spring.Boot.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}