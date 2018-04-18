package com.example.demo.Repository;

import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Το Repository είναι η είσοδος και η έξοδος της βάσης.
//Μπορουμε να χρησιμοποιήσουμε methods οπως save, delete, findBy αλλά και ολοκληρα sql ερωτήματα.
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
