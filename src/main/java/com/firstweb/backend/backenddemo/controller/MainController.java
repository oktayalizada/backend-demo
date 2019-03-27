package com.firstweb.backend.backenddemo.controller;


import com.firstweb.backend.backenddemo.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @GetMapping(value="/login")
    public ResponseEntity<User> getUser(){
        User a=new User();

        a.setLastName("Yunusova");
        a.setName("Susan");
        return new ResponseEntity<>(a, HttpStatus.OK);
    }



    @PutMapping(value="auth/users/{id}")
    public void updateUser(User user){
        System.out.println(user);
    }

    @PostMapping(value="/registration")
    public void createUser(){
        System.out.println("User has been created");
    }






}
