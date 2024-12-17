package com.akshay.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.school.model.School;

public interface SchoolRepository extends JpaRepository<School, Integer>{
    
}
