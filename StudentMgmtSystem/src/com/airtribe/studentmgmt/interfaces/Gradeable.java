package com.airtribe.studentmgmt.interfaces;

public interface Gradeable {
    default void showGradeRules(){
        System.out.println("Grading system based on assignments and attendance");
    }
}
