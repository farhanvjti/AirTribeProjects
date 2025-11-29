package com.airtribe.studentmgmt.service;

import com.airtribe.studentmgmt.entity.Course;

import java.util.ArrayList;

public class CourseService {

    private ArrayList<Course> courses= new ArrayList<>();

    public void addCourse(Course c){
        courses.add(c);
    }
    public void listCourse(){
        courses.forEach(Course::printCourse);
    }
}
