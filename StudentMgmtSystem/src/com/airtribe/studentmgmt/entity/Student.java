package com.airtribe.studentmgmt.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student extends Person{

    protected String cohortName;
    public Student(){
        super();
    }

    public Student(String name, String id, String cohortName) {
        super(name, id);
        this.cohortName = cohortName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name + " | ID: " + id + " | Cohort: " + cohortName);
    }
}
