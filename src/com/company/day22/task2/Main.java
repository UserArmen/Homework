package com.company.day22.task2;

public class Main {
    public static void main(String[] args) {
        DefaultStack defaultStack = new DefaultStack();
        defaultStack.push(4);
        defaultStack.push(5);
        defaultStack.push(10);
        defaultStack.push(3);
        defaultStack.push(3);

        System.out.println(defaultStack.pop());
        System.out.println(defaultStack.pop());
        System.out.println(defaultStack.pop());

    }
}
