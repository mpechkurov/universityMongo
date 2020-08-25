package com.example.university.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.university.domain.Department;

public interface DepartmentRepository extends MongoRepository<Department, String> {

    Optional<Department> findByName(String name);

    @Query("{ 'name' : { $regex : ?0 }}")
    List<Department> findNameByPattern(String pattern);

    //This method will fails because can't perform Joins across DBRef's
    List<Department> findByChairMemberLastName(String lastName);
}
