package com.ekart.ekartservice.service;

import com.ekart.ekartservice.entity.User;

import java.util.List;


public interface UserService {

    List<User> findAllUsers();

    User saveUser(User user);

    List<User> saveAllUsers(List<User> users);

    void deleteUser(Long number);
}
