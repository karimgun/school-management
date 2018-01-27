package com.akg.sm.domain;

import java.sql.Date;
import java.util.List;

public class Student extends Individual {

    private List<Parent> parents;

    private Class aClass;
    private Division division;

    private List<Subject> optionalSubjects;
}
