/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demojpa;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author itexps
 */
public interface UserRepository extends CrudRepository<User,Integer> {
    User findByLname(String lname);
    User findById(int Id);
}
