package com.example.demo.models;

import java.util.Map;
import java.util.Objects;

public class UserModel {
    private String name;
    private int userId;
    private String cpf;
    private String email;
    private String password;
    private Map<String, String> address;
    private int age;


    public UserModel(
            String name,
            int userId,
            String cpf,
            String email,
            String password,
            Map<String, String> address,
            int age
    ) {
        this.name = name;
        this.userId = userId;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
