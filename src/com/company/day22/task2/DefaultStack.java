package com.company.day22.task2;

public class DefaultStack implements Stack {

    private int index = 0;
    private int MAX_SIZE = 5;
    private int[] nums;

    public DefaultStack() {
        nums = new int[MAX_SIZE];
    }

    @Override
    public void push(int val) {

        if (index == MAX_SIZE) {
            throw new StackIndexOutOfBoundsException("There is no space");
        }

        nums[index] = val;
        // System.out.println("nums[" + index + "]= " + nums[index]);
        index++;


    }

    @Override
    public int pop() {

        if (index == 0) {
            throw new EmptyStackException("Empty stack");
        }
        int value = nums[index - 1];
        nums[index - 1] = 0;
        index--;
        return value;
    }
}