package com.example.university.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.university.domain.Staff;

public interface StaffRepository extends PagingAndSortingRepository<Staff, Integer> {

    List<Staff> findByMemberLastName(String lastName);

    @Query("{ 'member.firstName' : ?0 }")
    List<Staff> findByFirstName(String firstName);

}
