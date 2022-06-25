package com.example.musicschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MusicSchoolApplication {

    public static void main(String[] args) {

        SpringApplication.run(MusicSchoolApplication.class, args);
    }

}
