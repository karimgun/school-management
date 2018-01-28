package com.akg.sm.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "STUDENT")
public class Student extends Individual {

    @ManyToMany
    private List<Parent> parents;

    private Class aClass;
    private Division division;

    private List<Subject> optionalSubjects;

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
}
