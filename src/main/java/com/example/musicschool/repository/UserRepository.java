package com.example.musicschool.repository;

import com.example.musicschool.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findUserByEmail(String email);

    User save(User user);
}
