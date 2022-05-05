package com.shkandyuk.studentmanegementsystem.impl;

import com.shkandyuk.studentmanegementsystem.entity.Student;
import com.shkandyuk.studentmanegementsystem.repository.StudentRepository;
import com.shkandyuk.studentmanegementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
