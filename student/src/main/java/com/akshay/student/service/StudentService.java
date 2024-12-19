package com.akshay.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akshay.student.model.Student;
import com.akshay.student.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public void saveStudent(Student student) {
        repository.save(student);
    }

    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    public List<Student> findAllStudentsBySchoolId(Integer schoolId) {
        return repository.findAllBySchoolId(schoolId);
    }
}
