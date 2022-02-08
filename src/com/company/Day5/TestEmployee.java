package com.company.Day5;

public class TestEmployee {

    public static void main(String[] args) {
        Employee employee1 = new Employee(2,"employee1","student",25,'m');
        Employee employee2 = new Employee(2,"employee2","student",12,'m');
        Employee employee3 = new Employee(2,"employee3","student",27,'m');
        Employee employee4 = new Employee(2,"employee4","student",36,'f');
        Employee employee5 = new Employee(2,"employee5","student",74,'f');
        employee1.print();
        employee2.print();
        employee3.print();
        employee4.print();
        employee5.print();

    }

}
