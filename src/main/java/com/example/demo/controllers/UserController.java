package com.example.demo.controllers;
import com.example.demo.models.UserModel;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UserController {

    private UserService userService;

    @Autowired
    public  UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("user")
    public UserModel getUserByID(){
        return userService.getUserByID(1);
    }

    @GetMapping("/users")
    public List<UserModel> getAllUsers(){
        return userService.getAllUsers();
    }
}
