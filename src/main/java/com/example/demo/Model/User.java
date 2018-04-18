package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Κάθε κλάση που υπάρχει στον 'φάκελο' Model θα λειτουργεί σαν πίνακας στη βάση
//Μπορείς να δεις τους πινακες και τα περιεχόμενα τους ενώ τρέχει η εφαρμογή στη διεύθυνση localhost:8080/h2

@Entity // This tells Hibernate to make a table out of this class
public class User {

    //Το id δημιουργείτε αυτόματα για καθε καινουργια εγραφή και λειτουργει ως πρωτεύον κλειδι του πίνακα
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String email;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
