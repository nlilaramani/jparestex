/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demojpa;


import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author itexps
 */
@Component
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    public User getUserById(int id) {
        User user=userRepo.findById(id);
        return user;
    }    
    
    public User saveUser(User user) {
        userRepo.save(user);
        return user;
    }
     public Iterable<User> getUsers() {
         return userRepo.findAll();
    }   
     
     public void deleteUser(int id) {
       userRepo.delete(userRepo.findById(id));
    }   
    
     public void updateUser(User user) {
        userRepo.save(user);
    }
}
