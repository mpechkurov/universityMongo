package com.example.university.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.university.domain.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
