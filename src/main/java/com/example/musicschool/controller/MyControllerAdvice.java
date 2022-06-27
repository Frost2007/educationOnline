package com.example.musicschool.controller;

import com.example.musicschool.security.CurrentUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;


    @ControllerAdvice
    public class MyControllerAdvice {

        @ModelAttribute
        public CurrentUser currentUser(@AuthenticationPrincipal CurrentUser currentUser){
            return
                    currentUser;
        }
    }

