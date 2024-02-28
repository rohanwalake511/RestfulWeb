package com.example.RestfulWeb.controller;

import com.example.RestfulWeb.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getStudents() {

        return studentService.getStudents();

    }
}