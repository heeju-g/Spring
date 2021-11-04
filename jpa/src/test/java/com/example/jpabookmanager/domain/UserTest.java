package com.example.jpabookmanager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void test(){
        User user = new User();
        user.setEmail("heeju@gmail.com");
        user.setName("heeju");
        System.out.println(">>>"+user);
    }
}