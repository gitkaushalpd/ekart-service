package com.ekart.ekartservice.service;

import com.ekart.ekartservice.dao.UserDao;
import com.ekart.ekartservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> saveAllUsers(List<User> users) {
        return userDao.saveAll(users);
    }

    @Override
    public void deleteAll(User user){  userDao.delete(user);}

}
