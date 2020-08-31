package com.example.university.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.university.domain.Staff;

import reactor.core.publisher.Flux;

public interface StaffRepository extends ReactiveCrudRepository<Staff, Integer> {
    Flux<Staff> findByMemberLastName(String lastName);
}
