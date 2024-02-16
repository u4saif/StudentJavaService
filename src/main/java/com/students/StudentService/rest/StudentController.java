package com.students.StudentService.rest;


import com.students.StudentService.dao.StudentDAO;
import com.students.StudentService.entity.Student;
import com.students.StudentService.service.StudentAppService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentAppService studentAppService;
    @Autowired
    public StudentController(StudentAppService studentAppService) {
        this.studentAppService = studentAppService;
    }

    @PostConstruct
    public void createMockData(){
        System.out.println("PostConstruct called");
        //***Inserting Initial Data in DataBase
        // Student tempStudent = new Student("raja","Saif","saif@gmail.com");
        // studentDAO.save(tempStudent);
    }


    @GetMapping("/all")
    public List<Student> findAll(){
        System.out.println("Student List REST controller called");
        return studentAppService.findAll();
    }

    @GetMapping("{studentId}")
    public Student getStudentWithID(@PathVariable int studentId){
        Student result = studentAppService.findById(studentId);
        if(result == null){
            throw new StudentException("please mention a valid ID. "+studentId+" is not valid!");
        }
        return result;
    }


}
