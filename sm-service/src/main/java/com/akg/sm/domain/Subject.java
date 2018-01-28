package com.akg.sm.domain;

public class Subject {

    private Integer id;
    private String name;
    private String description;

    private Class aClass;
    private Integer maxMarks;
    private Integer passionMarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Integer getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(Integer maxMarks) {
        this.maxMarks = maxMarks;
    }

    public Integer getPassionMarks() {
        return passionMarks;
    }

    public void setPassionMarks(Integer passionMarks) {
        this.passionMarks = passionMarks;
    }
}
