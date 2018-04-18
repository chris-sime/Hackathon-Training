package com.example.demo.WebController;


import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Στους controllers βρισκεται η εισοδος του backend
//Οι controllers ειναι σε αναμονη για requests του χρηστη
//και οποτε υπαρξει request ενημερόνουν το Service
// ωστε να εκτελέσει την ενεργεια που ζήτησε ο χρηστης
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/addUser")
    public ResponseEntity<?> addUser(@RequestParam(value="name") String name,
                                     @RequestParam(value = "email") String email) {
        userService.addUser(name, email);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser(@RequestParam(value = "name")String name){
        return userService.findByUsername(name);
    }
}
