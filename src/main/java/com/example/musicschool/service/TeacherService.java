package com.example.musicschool.service;

import com.example.musicschool.entity.Teacher;
import com.example.musicschool.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> findById(int id) {
        return teacherRepository.findById(id);
    }

    public void deleteById(int id){
        teacherRepository.deleteById(id);
    }

    public Optional<Teacher> findTeacherBySpecilizationId(int id){
        return teacherRepository.findBySpecializationId(id);
    }



}
