package com.akshay.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
