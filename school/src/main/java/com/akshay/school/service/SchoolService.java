package com.akshay.school.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akshay.school.client.StudentClient;
import com.akshay.school.dto.FullSchoolResponse;
import com.akshay.school.model.School;
import com.akshay.school.repository.SchoolRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository repository;
    private final StudentClient client;

    public void saveSchool(School school) {
        repository.save(school);
    }

    public List<School> findAllSchools() {
        return repository.findAll();
    }

    public FullSchoolResponse findSchoolWithStudents(Integer schoolId) {
        var school = repository.findById(schoolId).orElse(
                School
                        .builder()
                        .name("NOT_FOUND")
                        .email("NOT_FOUND")
                        .build());

        var students = client.findAllStudentsBySchool(schoolId);

        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();

    }
}
