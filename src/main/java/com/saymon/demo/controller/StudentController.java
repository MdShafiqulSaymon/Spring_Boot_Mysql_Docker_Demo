package com.saymon.demo.controller;

import com.saymon.demo.model.Student;
import com.saymon.demo.services.StudentServices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServices studentServices;
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentServices.saveStudent(student);
        return "New Student Add Successfully";
    }
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentServices.getAllStudents();
    }
}
