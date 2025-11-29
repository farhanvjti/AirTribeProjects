package com.airtribe.studentmgmt.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {
    protected String name;
    protected String id;

    //0-arg constructor
    public Person() {
    }

    //parameterized constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    //copy constructor
    public Person(Person other){
        this.name=other.name;
        this.id=other.id;
    }

    public abstract void displayInfo();

}
