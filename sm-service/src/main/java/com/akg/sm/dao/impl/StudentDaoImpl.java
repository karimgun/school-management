package com.akg.sm.dao.impl;

import com.akg.sm.dao.StudentDao;
import com.akg.sm.domain.Class;
import com.akg.sm.domain.Division;
import com.akg.sm.domain.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Student getStudent(Integer studentId) {
        return entityManager.find(Student.class, studentId);
    }

    @Override
    public List<Student> getStudents(Division division) {
        TypedQuery<Student> query = entityManager.createQuery("from Student where division =" + division.getDivisionId(), Student.class);
        List<Student> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public List<Student> getStudents(Class aclass) {
        TypedQuery<Student> query = entityManager.createQuery("from Student where class =" + aclass.getClassId(), Student.class);
        List<Student> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public Student addStudent(Student student) {
        entityManager.persist(student);
        return student;
    }
}
