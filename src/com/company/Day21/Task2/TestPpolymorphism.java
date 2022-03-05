package com.company.Day21.Task2;

public class TestPpolymorphism extends Example{
    /**
    1 * compile time  polymorphism
     */
    public static int CompileTime(int a){
        return a+5;
    }
    public static int CompileTime(int a, int b){
        return a+b;
    }
    /**
     * 2
     * Rune Time  polymorphism
     */
    @Override
    public void RuneTime() {
        System.out.println("example rune time  polymorphism");
    }
}
