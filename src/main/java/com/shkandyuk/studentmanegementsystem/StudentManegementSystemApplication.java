package com.shkandyuk.studentmanegementsystem;

import com.shkandyuk.studentmanegementsystem.entity.Student;
import com.shkandyuk.studentmanegementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManegementSystemApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Alexey", "Ivanov", "alexiv@mal.ru" );
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Boris", "Korolev", "aborkor@mal.ru" );
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Mariya", "Ave", "avemariya@mal.ru" );
//		studentRepository.save(student3);

	}

	public static void main(String[] args) {
		SpringApplication.run(StudentManegementSystemApplication.class, args);
	}

}
