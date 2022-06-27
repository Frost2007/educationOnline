package com.example.musicschool.security;

import com.example.musicschool.entity.User;
import com.example.musicschool.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserDetailsImpl implements UserDetailsService {

   @Autowired
    private final UserRepository userRepository;


        @Override
        public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
            Optional<User> userByEmail = userRepository.findUserByEmail(email);
            if(userByEmail.isEmpty()){
                throw new UsernameNotFoundException("User is not found");
            }
            return new CurrentUser(userByEmail.get());
        }

    }
