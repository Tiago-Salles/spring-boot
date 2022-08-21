package com.example.demo.services;

import com.example.demo.models.UserModel;
import com.fasterxml.jackson.databind.JsonSerializable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserService {

    Integer userId = 0;
    HashMap<Integer, UserModel> allUsers = new HashMap<Integer, UserModel>();

    public UserModel getUserByID(Integer userId) {
        return allUsers.get(userId);
    }

    public List<UserModel> getAllUsers() {
        return allUsers.values().stream().toList();
    }

    public Integer registerNewUser(UserModel userModel) {
        userId++;
        userModel.setUserId(userId);
        allUsers.put(userId, userModel);
        return userModel.getUserId();
    }

    public UserModel updateUser(String password, Integer age, Integer userId) {
        UserModel user = allUsers.get(userId);
        user.setPassword(password);
        user.setAge(age);
        allUsers.put(userId, user);
        return user;
    }
}

