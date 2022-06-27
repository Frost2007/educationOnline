package com.example.musicschool.repository;

import com.example.musicschool.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Integer> {
   // List<Course> findAllByStudent_Id(int studentId);
}
