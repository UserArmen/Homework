package com.company.Day5;

public class Employee {
        int id;
        String name;
        String department;
        int age;
        char gender;
        int salary;


        public Employee(int id, String name, String department, int age, char gender) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.age = age;
            this.gender = gender;
        }

    public Employee() {
        this(0,null,null,0,' ');

    }

    public void print(){
            System.out.println("id " + id);
            System.out.println("name " + name);
            System.out.println("department " + department);
            System.out.println("age " + age);
            System.out.println("gender " + gender);

        }

    }


