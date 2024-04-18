package com.webproject.webprojectuni.service;

import com.webproject.webprojectuni.model.User;
public interface UserService {

    void save(User user);

    User findByUsername(String username);
}