package com.example.jpabookmanager.repository;

import com.example.jpabookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;
import java.util.List;


@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    
    @Test
    @Transactional
    void crud(){
        /*
        userRepository.save(new User());
        유저 테이블 모든 데이터를 리스트 형식으로 가져오기
        userRepository.findAll().forEach(System.out::println);
         */
        /*name 기준으로 역순 정렬.
        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC,"name"));
         */
        /* Lists는 테스트용 라이브러리에 존재.
        List<User> users = userRepository.findAllById(Lists.newArrayList(1L,3L,5L));
         */
        /*
        User user1 = new User("jack","jack@gmail.com");
        User user2 = new User("jacky","jacky@gmail.com");
        userRepository.saveAll(Lists.newArrayList(user1,user2));
        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);
         */
        //세션 유지하려고 @Transactional사용
        User user = userRepository.getById(1L);
        System.out.println(user);

    }
}