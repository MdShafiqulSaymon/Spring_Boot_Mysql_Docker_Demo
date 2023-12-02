package com.saymon.demo.services;

import com.saymon.demo.model.Student;

import java.util.List;

public interface StudentServices {
    Student saveStudent(Student student);

    List<Student> getAllStudents();
}
