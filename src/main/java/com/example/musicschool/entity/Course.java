package com.example.musicschool.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "course")
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String courseName;
    private double price;
    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;
//    @ManyToOne
//    @JoinColumn(name = "teacher_id")
//    //private  String teacher;
    private String description;
    private int duration;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date startDate;

}
