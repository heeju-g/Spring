package com.example.jpabookmanager.repository;

import com.example.jpabookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    
    @Test
    void crud(){
        userRepository.save(new User());
        //유저 테이블 모든 데이터를 리스트 형식으로 가져오기
        userRepository.findAll().forEach(System.out::println);
    }
}