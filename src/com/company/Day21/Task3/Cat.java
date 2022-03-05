package com.company.Day21.Task3;

public class Cat extends Animal{
    public int age = 5;
    public String name = "default_cat";

    @Override
    public void sound() {
        System.out.println("method cat");
    }
}
