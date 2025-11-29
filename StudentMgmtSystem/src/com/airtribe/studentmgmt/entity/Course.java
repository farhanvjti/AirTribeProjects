package com.airtribe.studentmgmt.entity;

public class Course {
    private int courseId;    //CohortID
    private String title;    //CohortName: Java/NodeJS

    public Course() {}

    public Course(int courseId, String title) {
        this.courseId = courseId;
        this.title = title;
    }

    public void printCourse() {
        System.out.println(courseId + ": " + title);
    }
}
