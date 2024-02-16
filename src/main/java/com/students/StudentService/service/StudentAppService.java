package com.students.StudentService.service;

import com.students.StudentService.entity.Student;

import java.util.List;

public interface StudentAppService {
    List<Student> findAll();
    void save(Student theStudent);
    Student findById(int id);
}
