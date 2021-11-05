package com.example.jpabookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void test(){
        User user = new User();
        user.setEmail("heeju@gmail.com");
        user.setName("heeju");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User(null, "heeju","heeju@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("heeju","heeju@gmail.com");

        User user3 = User.builder()
                        .name("heeju")
                                .email("heeju@gmail.com")
                                        . build();
        System.out.println(">>>"+user);
    }
}