package com.akg.sm.controller;

import com.akg.sm.controller.mapper.DomainViewMapper;
import com.akg.sm.domain.Student;
import com.akg.sm.service.StudentService;
import com.akg.sm.view.bean.StudentView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    @Resource(name = "domainViewMapper")
    private DomainViewMapper mapper;

    @RequestMapping(value = "/student")
    public StudentView getStudent(@PathVariable Integer studentId){
        Student student = studentService.getStudent(studentId);
        StudentView studentView = mapper.map(student, StudentView.class);
        return studentView;
    }
}
