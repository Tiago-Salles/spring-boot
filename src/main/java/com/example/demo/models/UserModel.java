package com.example.demo.models;

import java.util.Map;

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

    public int getUserId() {
        return userId;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    
}
