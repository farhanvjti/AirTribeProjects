package com.airtribe.studentmgmt.service;

import com.airtribe.studentmgmt.entity.GraduateStudent;
import com.airtribe.studentmgmt.entity.Student;
import com.airtribe.studentmgmt.interfaces.Searchable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student is added successfully");
    }

    public void listStudents() {
        students.forEach(s->s.printInfo(true));
    }

    public boolean deleteStudentById(String id) {
        if (id == null) return false;
        String key = id.trim();
        boolean removed = students.removeIf(s -> {
            String sid = s.getId();
            return sid != null && sid.trim().equals(key);
        });
        return removed;
    }

    /*public Iterable<Object> searchByName(String keyword) {
        ArrayList<Student> result = new ArrayList<>();
        students.forEach(s->{
            if(s.matches(keyword)) result.add(s);
        });
        return Collections.singleton(result);
    }*/

    public ArrayList<Student> searchByName(String keyword) {
        ArrayList<Student> result = new ArrayList<>();
        students.forEach(s -> {
            if (s.matches(keyword)) result.add(s);
        });
        return result;
    }
}
