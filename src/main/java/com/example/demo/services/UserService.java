package com.example.demo.services;

import com.example.demo.models.UserModel;
import com.fasterxml.jackson.databind.JsonSerializable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class UserService {
    List<UserModel> allUsers;

    public UserModel getUserByID(int userId) {
        return allUsers.get(0);
    }

    public List<UserModel> getAllUsers() {
        return allUsers;
    }

    public void registerNewUser(UserModel userModel) {
        allUsers = List.of(userModel);
    }
}

