package com.students.StudentService.rest;

import com.students.StudentService.entity.StudentErrorResponse;
import com.students.StudentService.entity.Students;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        if(studentId >= theStudents.size() || (studentId < 0)){
            throw new StudentException("please mention a valid ID. "+studentId+" is not valid!");
        }
        return theStudents.get(studentId);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> hendleException(StudentException exc){
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
}
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> hendleException(Exception exc){
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }

}
