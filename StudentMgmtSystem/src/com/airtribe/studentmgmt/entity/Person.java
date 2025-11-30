package com.airtribe.studentmgmt.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {
    protected String id;
    protected String name;

    //0-arg constructor
    public Person() {
    }

    //parameterized constructor
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //copy constructor
    public Person(Person other){
        this.id=other.id;
        this.name=other.name;
    }

    public abstract void printInfo(boolean showDetails);

}
