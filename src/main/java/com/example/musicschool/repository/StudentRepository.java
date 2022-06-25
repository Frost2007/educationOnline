package com.example.musicschool.repository;

import com.example.musicschool.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

//     List<Student> findStudentsByCourses_Id(int courses_id);
}

