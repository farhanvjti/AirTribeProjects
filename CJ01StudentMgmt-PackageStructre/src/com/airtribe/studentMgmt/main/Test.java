package com.airtribe.studentMgmt.main;

import com.airtribe.studentMgmt.entity.Student;
import com.airtribe.studentMgmt.service.Admission;

public class Test {
    public static void main() {
        Student s1 = new Student(101, "HK", "Java", "C16");
        Admission adm1 = new Admission(s1);
        adm1.feesPayment(s1, 80000);
        adm1.validateStudent();
        System.out.println("-----------************-------------git");
        Student s2 = new Student(102, "BK", "NodeJS", "C16");
        Admission adm2 = new Admission(s2);
        adm2.feesPayment(s2, 50000);
        adm2.validateStudent();
    }
}
