package com.airtribe.studentMgmt.service;

import com.airtribe.studentMgmt.entity.Student;     //importing class from other package.
import com.airtribe.studentMgmt.util.FeesPayment;
import com.airtribe.studentMgmt.util.FeesValidation;

public class Admission {
    Student s;
    //Total fees
    public final static int TOTALFEES=80000;

    public Admission(Student s) {
        this.s = s;
    }

    public void feesPayment(Student s, int amount){
        s.setFees(amount);
        FeesPayment pay = new FeesPayment(s.getFees());
    }

    public void validateStudent(){
        FeesValidation fv = new FeesValidation();
        int balanceFees = fv.validateFeesPayment(s);
        if (balanceFees == 0){
            System.out.println("Student is valid with no balance fees due");
        }
        else{
            System.out.println("Fees balance is due= Rs."+balanceFees);
        }
        getStudentDetails();
    }

    public void getStudentDetails(){
        System.out.println("Student Details:");
        System.out.println("Student Name= "+ s.getSname());
        System.out.println("Student ID= "+s.getSid());
        System.out.println("Cohort Id= "+s.getCohortid());
        System.out.println("Cohort Name= "+s.getCohortName());
    }
}
