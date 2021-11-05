package com.example.jpabookmanager.repository;

import com.example.jpabookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //JpaRepository<엔티티,pk타입>

}
