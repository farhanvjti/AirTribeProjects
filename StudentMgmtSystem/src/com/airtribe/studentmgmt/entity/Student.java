package com.airtribe.studentmgmt.entity;

import com.airtribe.studentmgmt.interfaces.Searchable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student extends Person implements Searchable {

    protected String cohortName;
    public Student(){
        super();
    }

    public Student(String id, String name, String cohortName) {
        super(id, name);
        this.cohortName = cohortName;
    }

    @Override
    public void printInfo(boolean showDetails) {
        System.out.println("Student: " + name + " | ID: " + id );
        if(showDetails){
            System.out.println("Cohort: "+ cohortName);
        }
    }

    @Override
    public boolean matches(String keyword) {
        if (keyword == null) return false;
        String k = keyword.trim().toLowerCase();
        return (name != null && name.toLowerCase().contains(k))
                || (id != null && id.toLowerCase().contains(k))
                || (cohortName != null && cohortName.toLowerCase().contains(k));
    }
}
