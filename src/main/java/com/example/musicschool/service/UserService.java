package com.example.musicschool.service;

import com.example.musicschool.entity.User;
import com.example.musicschool.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public User saveUserAsTeacher(User user) {
        userRepository.save(user);
        return user;
    }

    public List<User> findAll() {return userRepository.findAll();}

    public void deleteUserById(int userId){
        userRepository.deleteById(userId);
    }
}
