package com.students.StudentService.dao;

import com.students.StudentService.entity.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> findAll();
    void save(Student theStudent);
}
