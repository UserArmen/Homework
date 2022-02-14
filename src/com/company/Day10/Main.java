package com.company.Day10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int x = 958;
String o = "jfkn";
o.indexOf(3);
    }

    /**
     * 1.Print all integer numbers from 1 to 10.
     */
    public static void exeWhile1() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
    }

    /**
     * 2.Print all even integer numbers from 1 to 20.
     */
    public static void exeWhile2() {
        int i = 0;

        while (i < 20) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * 3.Print all exact squares of natural numbers that are not
     */
    public static void exeWhile3(int a) {
        int i = 0;
        while (i < a) {
            i++;
            if (i * i <= a) {
                System.out.println(i * i);
            } else break;
        }
    }

    /**
     * 4.Given an integer number, greater than 2.Find and print the
     * smallest natural divisor other than 1 for a given number.Input
     * number from console
     */
    public static int smallestDivisor(int n) {
        int k = 1;
        while (n % k != 0) {
            k++;
        }
        return k;

    }

    /**
     * 5.Print all integer powers of two not exceeding N in ascending
     * order.Input N from console.
     */
    public static void powerOfTwo(int x) {
        int k = 1;
        while (k <= x) {
            k = k << 1;
            if (k < x) {
                System.out.println(k);
            }
        }
    }

    /**
     * 6.For a given integer number N,print all integers in descending
     * order.
     */
    public static void print(int x) {
        int k = 0;
        while (x - k != 0) {
            x--;
            System.out.println(x - k);
        }
    }

    /**
     * 7.For a given integer number N,print all integers that are multiple of
     * 2 in descending order.
     */
    public static void multipleOf2(int n) {
        int k = 1;

        while (n > k) {
            k++;
            if (k % 2 == 0) {
                System.out.println(n - k);
            }

        }

    }

    /**
     * 8
     * Input N natural number till N would be the exact power of 2.If N is
     * the exact power of 2 .
     * - Print N
     * - Print count of input integers
     * - break loop
     */


    public static boolean isPowerOf2(int num) {

        return (num & (num - 1)) == 0;
    }

    public static void printN() {
        int count = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (isPowerOf2(n)) {
                System.out.print(n + " ");
                break;
            }
            count++;
        }
        System.out.println(count);
    }

    /**
     * 9.For a given natural N print the smallest integer k that`
     * Math.pow(2,k)≥N.(You can not use Math.pow())
     */
    public static void smallestInteger(int x) {
        int k = 1;
        int count = 0;
        while (x > k) {
            k = k << 1;
            count++;
            if (k >= x) {
                System.out.println(count);
                break;
            }
        }
    }

    /**
     * 10.Write Java program to print the table of characters that are
     * equivalent to the Ascii codes from 32 to 122.Print 10 characters
     * at each line.
     */
    public static void printSymbol() {
        int first = 32;
        int second = 122;
        while (first < second) {
            char ch = (char) first;
            System.out.print(ch);
            if (ch % 10 == 2) {
                System.out.println("\n");
            }
            first++;
        }

    }

    /**
     *
     11.Print all integer numbers from 1 to N, except that are multiple of
     3(Input N from console)
     */

    public static void multipleOfThree() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while (n > i) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
/**
 * 12.Given integer number A &gt; 1,define what is the Fibonacci number
 * is A, i.e print such number n that φn=A.If A is not a Fibonacci
 * number print -1.
 */

    /**
     * 13.On the first day, the athlete ran x kilometers,and then every day
     * he increased the mileage by 10% from the previous value,Given the
     * number y, determine the number of the day for which the athlete&#39;s
     * mileage will be at least y kilometers.
     */
/**
 * Write a Java Program to Compute the Sum of Digits in a given
 * Integer.
 */

}