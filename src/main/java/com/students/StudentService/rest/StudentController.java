package com.students.StudentService.rest;

import com.students.StudentService.entity.Students;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {

    List<Students> theStudents = new ArrayList<>();
    @PostConstruct
    public void createMockData(){
        System.out.println("PostConstruct called");
        theStudents.add(new Students("Saif","Shaikh"));
        theStudents.add(new Students("sana","Shaikh"));
        theStudents.add(new Students("Ayat.","rehman"));
    }
    @GetMapping("/all")
    public List<Students> getStudentsList(){
        System.out.println("Student List REST controller called");
        return theStudents;
    }

    @GetMapping("{studentId}")
    public Students getStudentWithID(@PathVariable int studentId){
        return theStudents.get(studentId);
    }

}
