package com.example.demo.Service;

import com.example.demo.Model.User;

import java.util.List;

public interface UserService {

    void addUser(String username,String email);
    List<User> getAllUsers();
    User findByUsername(String username);
}
