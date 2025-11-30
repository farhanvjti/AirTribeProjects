package com.airtribe.studentmgmt.service;

import com.airtribe.studentmgmt.entity.Course;
import com.airtribe.studentmgmt.entity.Enrollment;
import com.airtribe.studentmgmt.entity.Student;

import java.util.ArrayList;

public class EnrollmentService {
    private ArrayList<Enrollment> enrollments = new ArrayList<>();

    public void addEnrollment(Course c, Student s){
        enrollments.add(new Enrollment(c,s));
    }

    public void displayEnrolledStudents(){
        enrollments.forEach(Enrollment::printEnrollment);
    }
    public ArrayList<Enrollment> getEnrollments(){
        return enrollments;
    }
}
