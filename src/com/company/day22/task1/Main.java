package com.company.day22.task1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(outPoutNum());

    }
    public static int outPoutNum() {
        boolean flag = true;
        int num = 0;
        while (flag) {
            try {
                String n = sc.nextLine();

                num = Integer.parseInt(n);
                flag = false;


            } catch (NumberFormatException e) {

                System.out.println("Input integer type!!");
            }
        }
            return num;
    }
}
