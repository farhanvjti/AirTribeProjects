package com.airtribe.studentmgmt.entity;

public class Enrollment {
    private Course course;
    private Student student;

    public Enrollment() {
    }

    public Enrollment(Course course, Student student) {
        this.course = course;
        this.student = student;
    }
    public void printEnrollment() {
        System.out.println(student.name + " (" + student.cohortName + ") enrolled in " + course);
    }
}
