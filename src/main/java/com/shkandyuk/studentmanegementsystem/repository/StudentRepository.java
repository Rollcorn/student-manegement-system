package com.shkandyuk.studentmanegementsystem.repository;

import com.shkandyuk.studentmanegementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
