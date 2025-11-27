package com.airtribe.studentMgmt.util;

import com.airtribe.studentMgmt.entity.Student;

public class FeesValidation {
    private int due;
    public FeesValidation(){ //default is not allowed as they are in different packages, default is package-private.
    }
    public int validateFeesPayment(Student s){
        due = Student.TOTALFEES - s.getFees();
        return due;
    }
}

