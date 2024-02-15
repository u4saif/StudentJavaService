package com.students.StudentService.rest;


import com.students.StudentService.dao.StudentDAO;
import com.students.StudentService.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {

    private  StudentDAO studentDAO;
    public StudentController(StudentDAO thestudentDAO) {
        studentDAO = thestudentDAO;
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
        return studentDAO.findAll();
    }

    @GetMapping("{studentId}")
    public Student getStudentWithID(@PathVariable int studentId){
//        if(studentId >= theStudent.size() || (studentId < 0)){
//            throw new StudentException("please mention a valid ID. "+studentId+" is not valid!");
//        }
//        return theStudents.get(studentId);
        return null;
    }


}
