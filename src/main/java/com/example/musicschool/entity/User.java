package com.example.musicschool.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.Teacher;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String picUrl;
    private String phone;
    @JoinColumn(name = "role")
    @Enumerated(EnumType.STRING)
    private UserType role;
    @OneToOne(mappedBy ="user" )
    private Student student;
    @OneToOne(mappedBy = "user")
    private Teacher teacher;

}
