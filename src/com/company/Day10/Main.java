package com.company.Day10;

import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            computeSumOfDigits(1234);

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

            if (n % 2 == 0) {
                return 2;
            }

            int i = 3;
            while (i * i <= n) {

                if (n % i == 0) {

                    return i;

                }

                i += 2;
            }

            return n;

        }

        /**
         * 5.Print all integer powers of two not exceeding N in ascending
         * order.Input N from console.
         */
        public static void powerOfTwo(int x) {
            int k = 1;
            while (k <= x) {
                System.out.println(k);
                k = k << 1;

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
            if (n % 2 != 0) {
                n--;
            }
            while (n >= 2) {
                System.out.println(" " + n);
                n -= 2;
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
            while (first <= second) {
                char ch = (char) first;
                System.out.print(ch + " ");
                if (ch % 10 == 2) {
                    System.out.println("\n");
                }
                first++;
            }

        }

        /**
         * 11.Print all integer numbers from 1 to N, except that are multiple of
         * 3(Input N from console)
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

        public static void fibonacci(int k) {

            int i, n1 = 0, n2 = 1, n3;
            // System.out.print(n1+" "+n2);
            int count = 0;
            for (i = 2; i < k + 1; ++i) {
                n3 = n1 + n2;
                // System.out.print(" "+n3);
                n1 = n2;
                n2 = n3;
                count++;
                if (n3 == k) {
                    System.out.println("F(" + i + ") = " + k);
                    return;
                }
            }
            if (count >= k - 1) {
                System.out.println(-1);
            }

        }

        /**
         * 13.On the first day, the athlete ran x kilometers,and then every day
         * he increased the mileage by 10% from the previous value,Given the
         * number y, determine the number of the day for which the athlete&#39;s
         * mileage will be at least y kilometers.
         */

        public static int athleteMileage(double x, double y) {
            int days = 1;
            while (x < y) {
                x = x + x * 0.1;
                days++;
            }
            return days;
        }

        /**
         * 14
         * Write a Java Program to Compute the Sum of Digits in a given
         * Integer.
         */
        public static int depozidBank(double x, double y) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input num: ");
            int i = scanner.nextInt();
            int days = 1;
            while (x < y) {
                x = x + x * i;
                days++;
            }
            return days;
        }

        /**
         * 15.The sequence consists of different natural numbers and ends
         * with the number 0. Determine the value of the second largest
         * element in this sequence.
         */
        public static void DetermineValueOfSecondLargestElement() {
        Scanner sc = new Scanner(System.in);

            int max = Integer.MIN_VALUE;
            int second = 0;

            int num;
            do {

                num = sc.nextInt();
                if (num > max) {

                    second = max;
                    max = num;

                } else if (num > second && num != max) {
                    second = num;

                }
            } while (num != 0);
            System.out.println(second);

        }


        /**
         * 16.Write a program that generates a random number and asks the user
         * to guess what the number is. If the user’s guess is higher than the
         * random number, the program should display Too high, try again. If the
         * user’s guess is lower than the random number, the program should
         * display Too low, try again. If you find the number print Yes, you
         * guessed the number.The program should use a loop that repeats
         * until the user correctly guesses the random number.
         */


        /**17
         * Write a Java Program to Compute the Sum of Digits in a given
         * Integer.
         */
        public static void computeSumOfDigits(int num){


            int sum = 0;
            while (num>0){

                sum += num%10;

                num/=10;

            }

            System.out.println(sum);
        }
    }