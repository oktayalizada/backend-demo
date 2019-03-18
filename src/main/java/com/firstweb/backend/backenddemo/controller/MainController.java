package com.firstweb.backend.backenddemo.controller;


import com.firstweb.backend.backenddemo.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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






}
