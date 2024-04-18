package com.webproject.webprojectuni.dao;


import com.webproject.webprojectuni.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}