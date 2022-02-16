package com.company.Day11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    /**
     * 1. Write a java program to print all even numbers from a given
     * range, from a to b. Input a and b from console.Example`
     */
    public static void printOf(int a, int b) {

        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = b; i < a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * 2.Print all numbers on the segment from a to b that give the
     * remainder of c when divided by d. If such numbers do not exist,
     * then you do not need to display anything.
     */
    public static void printOfAll(int a, int b, int c, int d) {
        for (int i = a; i < b; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
        for (int i = b; i < a; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
    }

    /**
     * 3.Integers a and b are entered. It is guaranteed that a does not
     * exceed b.
     * Print all numbers on the segment from a to b that are exact
     * squares. If there are no such numbers, then you do not need to
     * display anything.
     */
    public static void printOfsquares(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                System.out.println(i + " ");
            }
        }
    }


    /**
     * 4.Enters 2 integer numbers : x and d from console
     * Count and print one number - how many times the digit d occurs in
     * the representation of a natural number x.
     */
    public static int printOfcount(int x, int b) {
        int count = 0;
        for (int i = x; i != 0; i /= 10) {
            if (i % 10 == b) {
                count++;
            }

        }
        return count;
    }

    /**
     * 5 Given an integer number x
     * Print the number consisting of the digits of the given number x in reverse
     * order. You do not need to output leading zeros.
     */
    public static int numberXInReverseOrder(int number) {

        int rev_num = 0;
        for (; ; ) {

            rev_num = rev_num * 10 + number % 10;
            number = number / 10;
            if (number < 1) {
                return rev_num;

            }

        }
    }

    /**
     * 6.Given an integer number x
     * Find the smallest natural divisor of x other than 1 (2 &lt;= x &lt;= 30000).
     */
    public static int printDivisorFromXToY(int n) {

        if (n % 2 == 0)
            return 2;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return i;
        }

        return n;


/**
 * 7.Given an integer number x
 * Print all natural divisors of the number x in ascending order (including 1
 * and the number itself).
 */
    }

    public static void printOfdivisors(int x) {

        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(x);
    }

    /**
     * 8. Given an integer x
     * Count the number of natural divisors of x (including 1 and the number
     * itself; x≤2 ∗ 109).
     */

    public static int countNumberOfNaturalDivisorsOfX(int n) {

        int count = 1;
        for (int i = 1; i * 2 <= n; i++) {
            if (n % i == 0) {
                count += 2;
            }
            if (n / i == i) {
                count--;
            }
        }
        return count;
    }


    /**
     * 9.Calculate the sum of the given 10 natural numbers.
     * Input integers from console
     */
    public static void sumOfNumbersFromConsole() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i <= 10; i++) {

            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }

    /**
     * 10
     * Convert a natural number from binary to decimal (no more than 10
     * digits in a binary number).
     *
     * @param bin
     */
    public static int numberFromBinaryToDecimal(int bin) {

        int dec = 0;
        int pow = 1;
        for (int num = bin; num != 0; num /= 10) {
            dec += (pow * num % 10);
            pow <<= 1;
        }
        return dec;
    }

    /**
     * 11
     * .Enter the number N, followed by N integers.
     * Count how many zeros, positive numbers, negative numbers
     * among the given N numbers.
     * - It is necessary to print first the number of zeros, then the number
     * of positive and negative numbers.
     *
     * @param n
     */
    public static void printCountNumbersPositiveOrNegative(int n) {
        Scanner sc = new Scanner(System.in);

        int countP = 0, countN = 0, countZ = 0, i;
        int[] arr = new int[n];


        System.out.print("Enter N Numbers: ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (arr[i] < 0)
                countN++;
            else if (arr[i] > 0)
                countP++;
            else
                countZ++;
        }

        System.out.println("\nPositive Number is: " + countP);
        System.out.println("Negative Number is: " + countN);
        System.out.println("Zero is: " + countZ);
    }

    /**
     * 12
     */
    public static void generateSequence(int second) {
        int count = 0;
        for (int i = 1; i <= second && count <= second; i++) {
            for (int j = 0; j < i && count < second; j++) {
                System.out.print(i + " ");
                count++;
            }

        }
    }

    /**
     * 13
     * Write a Java program by using two for loops to produce the output
     * shown below:
     * 1.Input N natural number, print picture like below in size N*N
     *
     * @param n n is count of line!!
     * @param k k is count of stars!!!
     */
    public static void printSquerePicture(int n, int k) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < k; j++) {

                System.out.print('*');

            }
            System.out.println();
        }
    }

    /**
     * 14
     */
    public static void printCheckerboardPattern(int n) {
        String row = " ";
        for (int i = 0; i < n; i++) {
            row += "#";
        }
        for (int i = 0; i < n; i++) {
            if ((i & i) == 1) {
                System.out.println(" ");
            }
            System.out.println(row);
        }
    }

/**
 * 15
 */
public  static void esiminch(int n) {
    for (int i = 0; i <= n; i++) {
        if (i == 0) {
            System.out.print(" * | ");
        } else {
            System.out.print(i + "   ");
        }
    }

    System.out.print("\n_____________________________\n");
    for (int i = 1; i <= n; i++) {
        if (i < 10) {
            System.out.print(" " + i + " |");
        } else {
            System.out.print(i + " |");
        }
        for (int j = 1; j <= n; j++) {
            if (i * j < 10) {
                System.out.printf("%2d  ", (i * j));
            } else {
                System.out.printf(" %2d ", (i * j));
            }
        }
        System.out.println();
    }
}}