package com.akshay.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}
