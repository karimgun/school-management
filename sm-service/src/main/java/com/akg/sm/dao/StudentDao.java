package com.akg.sm.dao;

import com.akg.sm.domain.Class;
import com.akg.sm.domain.Division;
import com.akg.sm.domain.Student;

import java.util.List;

public interface StudentDao {

    Student getStudent(Integer studentId);

    List<Student> getStudents(Division division);

    List<Student> getStudents(Class aclass);

    Student addStudent(Student student);
}
