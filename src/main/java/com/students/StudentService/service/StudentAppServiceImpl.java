package com.students.StudentService.service;

import com.students.StudentService.dao.StudentDAO;
import com.students.StudentService.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentAppServiceImpl implements StudentAppService{
    private StudentDAO studentDAO;
    @Autowired
    public StudentAppServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Autowired


    @Override
    public List<Student> findAll() {
        return this.studentDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
         this.studentDAO.save(theStudent);
    }

    @Override
    public Student findById(int id) {
        return this.studentDAO.findById(id);
    }
}
