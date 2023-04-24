package com.ekart.ekartservice.controller;


import com.ekart.ekartservice.entity.User;
import com.ekart.ekartservice.service.UserService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value = "*")
@RestController
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(value = "/findAllUsers")
    List<User> findAllUsers(){

        List<User> userList = new ArrayList<>();

        userList = userService.findAllUsers();

        return userList;
    }

    @PostMapping(value = "/saveUser")
     User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping(value = "/saveAllUsers")
    List<User> saveAllUsers(@RequestBody List<User> users){
        return  userService.saveAllUsers(users);
     }


     @DeleteMapping(value="/deleteAll")
    void deleteAll(@PathVariable User user){
         userService.deleteAll(user);
     }

}
