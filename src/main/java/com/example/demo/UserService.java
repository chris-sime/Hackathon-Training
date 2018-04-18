package com.example.demo;

import java.util.List;

public interface UserService {

    void save(User user);

    void addUser(String name,String email);

    List<User> getAllUsers();
    User findByName(String username);
}
