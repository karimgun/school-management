package com.akg.sm.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "STUDENT")
public class Student extends Individual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_PARENT", joinColumns = {@JoinColumn(name = "STUDENT_ID")}, inverseJoinColumns = {@JoinColumn(name = "PARENT_ID")})
    private List<Parent> parents;

    @ManyToOne(optional = false)
    private Class aClass;

    @ManyToOne(optional = false)
    private Division division;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_OPTIONAL_SUBJECTS", joinColumns = {@JoinColumn(name = "STUDENT_ID")}, inverseJoinColumns = {@JoinColumn(name = "SUBJECT_ID")})
    private List<Subject> optionalSubjects;

    @Column
    private Date enrollmentDate;

    @Column
    private Date separationDate;

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public List<Subject> getOptionalSubjects() {
        return optionalSubjects;
    }

    public void setOptionalSubjects(List<Subject> optionalSubjects) {
        this.optionalSubjects = optionalSubjects;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Date getSeparationDate() {
        return separationDate;
    }

    public void setSeparationDate(Date separationDate) {
        this.separationDate = separationDate;
    }
}
