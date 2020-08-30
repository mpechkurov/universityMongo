package com.example.university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.university.domain.Department;
import com.example.university.repo.DepartmentRepository;

@SpringBootApplication
public class UniversityMongoApplication implements CommandLineRunner {

	@Autowired
	DepartmentRepository departmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(UniversityMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
