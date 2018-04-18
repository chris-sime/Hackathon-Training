package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//Στο Service ειναι η λογική της εφαρμογής.
//Απο το service ζηταει τα δεδομενα ο controller για να τα σερβιρει στο frontend
//
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    //Στη συγκεκριμένη περιπτωση ο χρηστης απο το frontend ζηταέι να καταχωρηθεί ενας χρήστης με
    //ενα username και ενα email
    //Το Service δημιουργει ενα μοντελο User.
    //Του δίνει τις τιμες που εδωσε ο χρηστης (username και email)
    //και καλεί το Repository να τον αποθηκευσει στη βαση
    @Override
    public void addUser(String username, String email){
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
