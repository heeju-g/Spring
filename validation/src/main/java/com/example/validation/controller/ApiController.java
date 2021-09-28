package com.example.validation.controller;

import com.example.validation.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    /* 예전 방식
    public ResponseEntity user(@RequestBody User user){
        if(user.getPhoneNumber()=="xxx-xxxx-xxxx"){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
        }
        return ResponseEntity.ok(user);
    }
    
     */
    @PostMapping("/user")
    public User user(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

    
        
}
