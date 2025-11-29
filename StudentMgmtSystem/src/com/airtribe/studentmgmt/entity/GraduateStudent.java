package com.airtribe.studentmgmt.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GraduateStudent extends Student{
    @Getter
    @Setter
    private String gradDate;
    public GraduateStudent(String name, String id,
                           String cohortName,
                           String graduationDate) {
        super(name, id, cohortName);
        this.gradDate = graduationDate;
    }
    @Override
    public void displayInfo() {
        System.out.println("[GRADUATE] " + getName() +
                " | Cohort: " + getCohortName() +
                " | Graduated: " + getGradDate());
    }
}
