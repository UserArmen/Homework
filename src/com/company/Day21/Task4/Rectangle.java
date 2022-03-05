package com.company.Day21.Task4;

public class Rectangle implements Shape{
    @Override
    public int perimeter() {
        return 0;
    }
    public int perimeter(int length, int width ) {
        return 2*(width+length);
    }


    @Override
    public int area() {
        return 0;
    }
    public int area(int length, int width) {
        return width*length;

    }


}
