package com.company.Day20.Tack1;

import com.company.Day20.Tack1.Shape;

public class Square extends Shape {
    @Override
    protected double getArea(double radius) {
        return radius*radius;
    }

    @Override
    protected double getPerimeter(double radius) {
        return radius*4;
    }

}
