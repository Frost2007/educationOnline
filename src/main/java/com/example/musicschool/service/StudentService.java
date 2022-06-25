package com.example.musicschool.service;

import com.example.musicschool.entity.Student;
import com.example.musicschool.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Optional<Student> findStudentById(int studentId){
       return studentRepository.findById(studentId);

    }
    public Page<Student> findAllStudents(PageRequest pageRequest) {
        return studentRepository.findAll(pageRequest);
    }
    public void deleteStudentById(int id){ studentRepository.deleteById(id);}

    public void saveStudent(Student student){ studentRepository.save(student);}

//    public List<Student> findStudentByCourseId(int courseId){
//       return studentRepository.findStudentsByCourses_Id(courseId);
//    }

}
