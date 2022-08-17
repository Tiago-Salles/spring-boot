package com.example.demo.models;

public class UserModel {
     private String name;
     private int userId;

     public  UserModel(String name, int userId){
          this.name = name;
          this.userId = userId;
     }

     public String getName() {
          return name;
     }

     public int getUserId(){
          return userId;
     }
}
