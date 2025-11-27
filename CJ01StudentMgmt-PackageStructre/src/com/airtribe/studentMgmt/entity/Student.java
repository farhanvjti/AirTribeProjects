package com.airtribe.studentMgmt.entity;


import lombok.Getter;
import lombok.Setter;

public class Student {
    //Instance Variables
    @Getter @Setter
    private int sid;
    @Getter @Setter
    private String sname;
    @Getter @Setter
    private String cohortName;
    @Getter @Setter
    String cohortid;  //default modifier which is package-private
    @Getter @Setter
    int fees;

    //Total fees
    public final static int TOTALFEES=80000;

    public Student(int sid, String sname, String cohortName, String cohortid) {
        this.sid = sid;
        this.sname = sname;
        this.cohortName = cohortName;
        this.cohortid = cohortid;
    }
}
