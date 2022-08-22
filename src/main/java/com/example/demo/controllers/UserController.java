package com.example.demo.controllers;

import com.example.demo.entities.UserEntity;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public UserEntity getUserByID(@PathVariable Integer userId) {
        return userService.getUserByID(userId);
    }

    @GetMapping("/all")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/create")
    public Integer registerNewUser(@RequestBody UserEntity userModel) {
        return userService.registerNewUser(userModel);
    }

    @PutMapping("/update-information/")
    public UserEntity updateUser(@RequestBody HashMap<String, String> userInformations) {
        return userService.updateUser(userInformations.get("password"), Integer.valueOf(userInformations.get("age")), Integer.valueOf(userInformations.get("userId")));
    }
}
