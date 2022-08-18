package com.example.demo.services;

import com.example.demo.models.UserModel;
import com.fasterxml.jackson.databind.JsonSerializable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserService {
    HashMap<Integer, UserModel> allUsers = new HashMap<Integer, UserModel>();

    public UserModel getUserByID(int userId) {
        return allUsers.get(userId);
    }

    public List<UserModel> getAllUsers() {
        return allUsers.values().stream().toList();
    }

    public HashMap<String, Integer> registerNewUser(UserModel userModel) {
        allUsers.put(userModel.getUserId(), userModel);
        HashMap<String, Integer> newUser = new HashMap<String, Integer>();
        newUser.put("userId", userModel.getUserId());
        return newUser;
    }

    public UserModel updateUser(HashMap<String, String> userInformations, int userId) {
        UserModel user = allUsers.get(userId);
        int userAge = Integer.getInteger(userInformations.get("age"));
        UserModel userWithNewInformation = new UserModel(
                user.getName(),
                user.getUserId(),
                user.getCpf(),
                user.getEmail(),
                userInformations.get("password"),
                user.getAddress(),
                userAge);
        allUsers.put(userId, userWithNewInformation);
        return userWithNewInformation;
    }
}

