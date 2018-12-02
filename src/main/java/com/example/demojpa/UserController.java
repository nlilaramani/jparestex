/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demojpa;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author itexps
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping()
    public List<User> list() {
        
        List<User> list=new ArrayList<User>();
        for(User user:service.getUsers()){
            list.add(user);
        }
        return list;
        //return service.getUsers();
    }
    
    @GetMapping("/{id}")
    public User get(@PathVariable int id) {
        return service.getUserById(id);
    }
    
    @PutMapping("/{id}")
    public User put(@PathVariable String id, @RequestBody User input) {
        service.updateUser(input);
        return service.getUserById(input.getId());
    }
    
    @PostMapping
    public User post(@RequestBody User input) {
        return service.saveUser(input);
        //return null;
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        service.deleteUser(id);
        return null;
    }
    
}
