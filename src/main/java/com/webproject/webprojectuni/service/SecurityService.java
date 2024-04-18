package com.webproject.webprojectuni.service;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}