package com.example.demo.services;
import com.example.demo.models.UserModel;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {
    public UserModel getUserByID(int userId){
        return new UserModel("Tiago",1);
    }

    public List<UserModel> getAllUsers(){
        return List.of(
                new UserModel("Pietra",1),
                new UserModel("Tiago",2)
        );
    }
}

