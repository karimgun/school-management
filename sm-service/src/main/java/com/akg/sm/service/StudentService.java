package com.akg.sm.service;

import com.akg.sm.domain.Class;
import com.akg.sm.domain.Division;
import com.akg.sm.domain.Student;

import java.util.List;

public interface StudentService {

    Student getStudent(Integer studentId);

    List<Student> getStudents(Division division);

    List<Student> getStudents(Class aClass);

    Student addStudent(Student student);

    Student updateStudent(Student student);

}
