package com.akshay.school.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.akshay.school.dto.Student;

@FeignClient(name = "students", url = "http://localhost:8090/api/v1/students/")
public interface StudentClient {
    @GetMapping("/school/{school-id}")
    List<Student> findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId);
}
