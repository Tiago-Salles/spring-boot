package com.example.demo.services;

import com.example.demo.entities.UserEntity;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class UserService {

    public final UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    Integer userId = 0;
    HashMap<Integer, UserEntity> allUsers = new HashMap<Integer, UserEntity>();

    public UserEntity getUserByID(Integer userId) {
        return allUsers.get(userId);
    }

    public List<UserEntity> getAllUsers() {
        return allUsers.values().stream().toList();
    }

    public Integer registerNewUser(UserEntity userModel) {
        userId++;
        userModel.setUserId(userId);
        allUsers.put(userId, userModel);
        return userModel.getUserId();
    }

    public UserEntity updateUser(String password, Integer age, Integer userId) {
        UserEntity user = allUsers.get(userId);
        user.setPassword(password);
        user.setAge(age);
        allUsers.put(userId, user);
        return user;
    }
}

