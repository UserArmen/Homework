package com.company.day22.task2;

public class EmptyStackException extends RuntimeException{
    public  EmptyStackException(String message){
        System.out.println(message);
    }
}