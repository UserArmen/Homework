package com.company.Day8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Main a = new Main();

a.equalsCount();

    }


    /**
     * 1
     * Write a Java program to allow the user to input his/her age. Then the
     * program will show if the person is eligible to vote. A person who is
     * eligible to vote must be older than or equal to 18 years old.
     */
    public void result() {
        System.out.println("Entre your age ");

        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You can to vote");
        } else if (age <= 18) {
            System.out.println("You can not vote");
        } else {
            System.out.println("Invalid value ");
        }

    }

    /**
     * 2
     * Write a Java program to determine whether an input number is an
     * even number.         isEven
     */

    void print() {
        System.out.println("Entre  your number ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else if (!(num % 2 == 0)) {
            System.out.println("odd");
        } else {
            System.out.println("Invalid value");
        }

    }

    /**
     * 3
     * Generate and print random integer number between 2 to 7(not using
     * bound)
     */

    void randomnumber() {
        int low = 2;
        int high = 7;

        double x = Math.random();
        int result = (int) (Math.random() * (high - low) + 1) + low;
        System.out.println("Random value " + result);
    }

    /**
     * 4
     * Write a Java program to determine whether an input number is a
     * multiple of a 5.
     */
    void multiple() {
        int result = scanner.nextInt();
        if (result % 5 == 0) {
            System.out.println("multiple of  5.");
        } else {
            System.out.println("Not multiple of 5");
        }
    }

    /**
     * 5
     * Take three numbers from the user and print the greatest number.
     */

    void greatest_number() {
        System.out.println("number1");
        int a = scanner.nextInt();
        System.out.println("number 2");
        int b = scanner.nextInt();
        System.out.println("number3");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("grate number is" + a);
        } else if (b < a && b < c) {
            System.out.println("grate number is " + b);
        } else if (c < a && c < b) {
            System.out.println("grate number is " + c);
        }
    }

    /**
     * 6
     * Write a Java program that reads a floating-point number and prints
     * &quot;zero&quot; if the number is zero. Otherwise, print &quot;positive&quot; or &quot;negative&quot;.
     * Add &quot;small&quot; if the absolute value of the number is less than 1, or
     * &quot;large&quot; if it exceeds 1,000,000
     * (use Math.abs() for absolute value)
     */


    public void positive_Negative() {
        float a = scanner.nextInt();
        if (a == 0) {
            System.out.println(" 0 ");
        }
        if (a > 0) {
            if (a < 1) {
                System.out.println("Positive small");

            } else if (a > 1_000_000) {
                System.out.println("Positive large ");
            }
        }
        if (a < 0) {
            if (Math.abs(a) < 1) {
                System.out.println(" Negative small");
            } else if (Math.abs(a) < 1_000_000) {
                System.out.println("Negative large");
            }
        }


    }

    /**
     * 7
     * Write a Java program that keeps a number from the user and generates
     * an integer between 1 and 7 and displays the name of the weekday.
     */

    void numWeekday() {

        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Sunday");
        }
        if (a == 2) {
            System.out.println("Monday");
        }
        if (a == 3) {
            System.out.println("Tuesday");
        }
        if (a == 4) {
            System.out.println("Wednesday");
        }
        if (a == 5) {
            System.out.println("Thursday");
        }
        if (a == 6) {
            System.out.println("Friday");
        }
        if (a == 7) {
            System.out.println("Saturday");
        }

    }

    /**
     * 8
     * The ice cream parlor sells three balls and five balls. Can you buy
     * exactly k balls of ice cream?
     * In the cafe they sell an ice-cream with 3 balls and 5 balls.Input K integer
     * value from console, check if you can buy exactly K balls ice-cream.
     */
    void iceCream() {
        int k = scanner.nextInt();
        if (k < 3) {
            System.out.println("you can't buy ice-cream");
        } else if (k == 3 || k == 5) {
            System.out.println("you can buy ice-cream");
        } else if (k % 3 == 0 && k % 5 == 0) {
            System.out.println("you can buy");
        } else {
            System.out.println("you can't buy");
        }
    }

    /**
     * 9
     * LEAP YEAR
     * Write a Java program that takes a year from the user and print whether
     * that year is a leap year or not.
     */
    void leap_year() {
        int year = scanner.nextInt();
        if (year != 0 && year % 4 == 0 || year % 400 == 0) {
            System.out.println(" Yeas: not a leap year:");
        } else {
            System.out.println("No: Leap year:");
        }
    }

    /**
     * 10
     * .Generate random integer value, print true if random value
     * corresponds these conditions, else print false(use boolean primitive
     * type)
     * -input number is greater than -1000 and less than 1000
     * -input number is multiple of 3 or input number is multiple of 5
     */
    void print_random() {
        boolean flag = false;
        Random random = new Random();
        int a = random.nextInt();
        if (a > -1000 && a < 1000) {
            flag = true;
        }
        System.out.print(a);
        System.out.println(flag);


    }

    /**
     * 11
     * Input from console int a and int b, if a and b corresponds for following
     * requirements print “Both a and b legal”, if any of them does not
     * correspond print about it like this “a is legal b is illegal &#39;&#39;. or vice versa
     * - a &gt; 10 and b is not equal to 10
     * - both a and b is positive
     * - both a and b is negative
     * - a &gt; 10 b &lt; 1 both of them are odd
     * - a is a multiple of 5 OR b is a multiple of 5
     * - a is not a multiple of 5 but b is a multiple of 5
     */
    public void a_And_b() {
        System.out.println("Please input a");
        int a = scanner.nextInt();
        System.out.println("Please input b");
        int b = scanner.nextInt();
        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal");
        } else System.out.println("Both a and b illegal");
        if (a > 10 || b == 10) {
            System.out.println("a is legal b is illegal");
        } else if (a < 10 || b != 10) {
            System.out.println("b is legal a is illegal");
        }
        if (a > 0 && b > 0) {
            System.out.println("Both a and b legal");
        } else System.out.println("Both a and b illegal");
        if (a < 0 && b > 0) {
            System.out.println("a is legal b is illegal");
        } else if (a > 0 && b < 0) {
            System.out.println("b is legal a is illegal");
        }
        if (a < 0 && b < 0) {
            System.out.println("Both a and b legal");
        } else {
            System.out.println("Both a and b illegal");
        }
        if (a < 0 && b > 0) {
            System.out.println("a is legal b is illegal");
        } else if (a > 0 && b < 0) {
            System.out.println("b is legal a is illegal");
        }
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both a and b legal");
        } else System.out.println("Both a and b illegal");
        if (a % 2 == 0 && b % 2 != 0) {
            System.out.println("a is legal b is illegal");
        } else if (a % 2 != 0 && b % 2 == 0) {
            System.out.println("b is legal a is illegal");
        }
        if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else System.out.println("Both a and b illegal");
        if (a % 5 == 0 && b % 5 != 0) {
            System.out.println("a is legal b is illegal");
        } else if (a % 5 != 0 && b % 5 == 0) {
            System.out.println("b is legal a is illegal");
        }
        if (a % 5 == 0 && b % 5 != 0) {
            System.out.println("Both a and b legal");
        } else System.out.println("Both a and b illegal");
        if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("a is legal b is illegal");
        } else if (a % 5 != 0 && b % 5 != 0) {
            System.out.println("b is legal a is illegal");
        }
    }

    /**
     * 12
     * Input int values a and b from console
     * - if one of them is multiple of 7, and both positive, and a
     * greater than b, print all odd values between them
     * - else print all even values between them*
     */


    void solution() {
        System.out.println("Enter A");
        int a = scanner.nextInt();
        System.out.println("Enter B");
        int b = scanner.nextInt();
        if ((a > 0 && b > 0) && (a % 7 == 0 || b % 7 == 0) && a > b) {
            for (int i = b; i <= a; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = b; i <= a; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }


    /** 13
     *Given coordinates of two points in the coordinate plane.Write
     * java program to check if the points lie in the same plane?(quarter)
     * - Print In the same quarter , else print Not in the same quarter.
     * - Input 4 coordinates from console, all 4 coordinates != 0.
     */
    /** 14
     * Given 3 positive numbers different from 0, Determine if there is
     * a non-degenerate triangle with such sides.
     * - Input numbers from console
     */

    /**15
     * 13.Given 3 numbers, print count of numbers that equals to each
     * other.(Input numbers from console)Example`
     * Input numbers`
     * -3
     * -1
     * -3
     * Output` 2
     */
    void equalsCount() {

        System.out.println("Enter A");
        int a = scanner.nextInt();
        System.out.println("Enter B");
        int b = scanner.nextInt();
        System.out.println("Enter C");
        int c = scanner.nextInt();
        if (a != 0 && b != 0 && c != 0) {
            if (a == b && a == c) {
                System.out.println("3");
            } else if ((a == b && a !=c )||( a == c && a != b) || (c == b && c !=a )||(c==a&&c!=b)) {
                System.out.println("2");
            } else if (a!=b && a !=c){
                System.out.println("0");
            }
            else {

                System.out.println("1");
            }
        }
    }

}






