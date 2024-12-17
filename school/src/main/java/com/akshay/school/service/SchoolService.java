package com.akshay.school.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akshay.school.model.School;
import com.akshay.school.repository.SchoolRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository repository;

    public void saveSchool(School school) {
        repository.save(school);
    }

    public List<School> findAllSchools() {
        return repository.findAll();
    }
}
