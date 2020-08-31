package com.example.university.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.university.domain.Department;

public interface DepartmentRepository extends ReactiveCrudRepository<Department, String> {

}
