package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello-world")
	public String HelloWorld(){
		return "Hello World 123";
	}


	@GetMapping("/students")
	public List<Student> getStudents(){
		return List.of(
				new Student(
						1L,
						"supakrit",
						"supakrit@mail.com",
						LocalDate.of(1997, Month.JANUARY , 3),
						25
				)
		);
	}

}
