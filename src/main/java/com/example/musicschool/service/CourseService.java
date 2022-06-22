package com.example.musicschool.service;

import com.example.musicschool.entity.Course;
import com.example.musicschool.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public List<Course> allCoursesOfStudent(int studentId){
        return courseRepository.findAllByStudent_Id(studentId);
    }

}
