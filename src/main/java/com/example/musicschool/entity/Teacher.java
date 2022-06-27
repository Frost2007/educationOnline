package com.example.musicschool.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private int userId;
    @OneToOne
    @JoinColumn(name = "specialization_id")
    private Specialization specialization;
    private String education;
    @ManyToMany
    private List<Course> courses;
}
