package com.company.Day21.Task4;

public class Square implements Shape{
    @Override
    public int perimeter() {
        return 0;
    }

    @Override
    public int area() {
        return 0;
    }

    public int perimeter(int width) {
        return width * 4;
    }
        public int area(int width){
        return width*width;

        }

}
