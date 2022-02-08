package com.company.Day5;

public class Person {
    static int id;
    String name;

    public Person() {
        this(null);
    }

    public Person(String name) {
        this.name = name;
        id++;
    }
}
