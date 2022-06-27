package com.example.musicschool.repository;

import com.example.musicschool.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

//     List<Student> findStudentsByCourses_Id(int courses_id);
   }

