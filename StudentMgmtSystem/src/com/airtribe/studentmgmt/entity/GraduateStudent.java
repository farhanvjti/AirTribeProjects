package com.airtribe.studentmgmt.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GraduateStudent extends Student{
    @Getter
    @Setter
    private String specialization;
    private String admissionDate;
    private String graduationDate;
    public GraduateStudent(String name, String id,
                           String cohortName,
                           String specialization) {
        super(name, id, cohortName);
        this.specialization = specialization;
    }
    @Override
    public void printInfo(boolean showDetails) {
        super.printInfo(showDetails);
        if (showDetails){
            System.out.println("Graduated into "+getSpecialization());
        }
    }

    public void setCreatedOn(String createdOn) {
        this.admissionDate = createdOn;
    }
    public void setgraduationDate(String dt){
        this.graduationDate = dt;
    }
}
