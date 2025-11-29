package com.airtribe.studentmgmt.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GraduateStudent extends Student{
    @Getter
    @Setter
    private String specialization;
    public GraduateStudent(String name, String id,
                           String cohortName,
                           String specialization) {
        super(name, id, cohortName);
        this.specialization = specialization;
    }
    @Override
    public void displayInfo() {
        System.out.println("[GRADUATE] " + getName() +
                " | Cohort: " + getCohortName() +
                " | Graduated: " + getSpecialization());
    }
}
