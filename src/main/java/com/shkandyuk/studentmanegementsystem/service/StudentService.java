package com.shkandyuk.studentmanegementsystem.service;

import com.shkandyuk.studentmanegementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
