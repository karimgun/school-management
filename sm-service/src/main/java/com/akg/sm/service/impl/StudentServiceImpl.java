package com.akg.sm.service.impl;

import com.akg.sm.dao.StudentDao;
import com.akg.sm.domain.Class;
import com.akg.sm.domain.Division;
import com.akg.sm.domain.Student;
import com.akg.sm.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student getStudent(Integer studentId) {
        Student student = studentDao.getStudent(studentId);
        return null;
    }

    @Override
    public List<Student> getStudents(Division division) {
        List<Student> students = studentDao.getStudents(division);
        return students;
    }

    @Override
    public List<Student> getStudents(Class aclass) {
        List<Student> students = studentDao.getStudents(aclass);
        return students;
    }

    @Transactional()
    public Student addStudent(Student student) {
        studentDao.addStudent(student);
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }
}
