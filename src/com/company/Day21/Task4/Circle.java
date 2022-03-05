package com.company.Day21.Task4;

public class Circle implements Shape{
    @Override
    public int perimeter() {
        return 0;
    }
    public double perimeter(int r) {
        return  (Math.PI*2*r);
    }

    @Override
    public int area() {
        return 0;
    }
    public double area(int r) {
        return Math.PI*r*r;
    }
}
