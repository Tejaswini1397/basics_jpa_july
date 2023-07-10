package com.example.jpabasicsjuly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody Student student){
        String response=studentService.addStudent(student);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
    @GetMapping("/get_by_Id")
    public ResponseEntity getStudentById(@RequestParam("rollNo") int rollNo){
        Student student=studentService.getStudentById(rollNo);
        if(student==null){
            return new ResponseEntity<>("Invalid Roll No",HttpStatus.NOT_FOUND);
        }
       return new ResponseEntity<>(student,HttpStatus.FOUND);
    }

}
