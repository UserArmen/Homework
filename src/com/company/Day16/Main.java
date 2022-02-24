package com.company.Day16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
printCheckerBoard(4,4);
    }

    /**
     * 1.A natural number N is given (entered from the keyboard). Calculate two to the power of N
     * Display the calculated value (1 &lt;= N &lt;= 15).
     */
    public static int powerOf_N(int n){

        if(2>=n&&n>=16){
            System.out.println("invalid value");
        }
        return n=2<<n;
    }
    /**
     * 2.Given number n. N minutes have passed since the beginning of the day. Determine how many
     * hours and minutes the digital clock will show at this moment. The program should print two
     * numbers: the number of hours (from 0 to 23) and the number of minutes (from 0 to 59). Note that
     * the number n can be more than the number of minutes in a day.
     */
    public static void  hoursAndMinutes(int n){
        int minute = n%60;
        int hour = n/60;

        System.out.println(hour%24 + ":" + minute);


    }
    /**
     * 3.Write a java program to determine whether the number is prime or not.
     */
    public boolean isPrime(int n) {
        if (n == 1) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i < n / 2; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * 4.You are given two four-digit numbers A and B. Print all four-digit numbers on the segment from A
     * to B, the record of which is a palindrome.
     */
    public static void palindrome(int a, int b){
        for (int i = a; i <=b ; i++) {
            if (i==reverse(i)){
                System.out.println(i);
            }
        }

    }
    public static int reverse(int n){
        int result = n%10*1000;
        result+=n/10%10*100;
        result+=n/100%10*10;
        result+=n/1000;
        return result;
    }
    /**5
     * A three-letter word is given. The word consists only of Latin letters, small and large. Print the
     * same word, where the first letter is capitalized, the rest are small.
     */
    public static String firstLetterIsCapitalized(String str){
        str = str.toLowerCase();
       String result = str.substring(0,1).toUpperCase()+str.substring(1);
        return result;
    }
    /**
     * 6.Enter the number N and draw an NxN checkerboard where the top left is white. Designate white
     * margins O, black margins X. Use a for loop.
     */

    public static void printCheckerBoard(int rows, int cols)
    {
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
                if((i%2==1 && j%2==1) || (i%2==0 && j%2==0))
                    System.out.print("#");
                else
                    System.out.print("O");
            System.out.println();
        }
    }
    /**
     * 7.The first term and the denominator of the geometric progression are given (real numbers b1 and
     * q, q! = 0). An integer n is also given. Print the n-th term of a geometric progression. Don&#39;t use the
     * pow function, use a for loop. Print the answer with precision exactly two characters after the
     * period.
     */
    public static int TwoPowerOfN(int N, int P) {

        int pow = 1;
        for (int i = 1; i <= P; i++)
            pow *= N;
        return pow;
    }
    public static int printNthTermOfGeometricProgression(int b, int q, int num) {

        return num = b * TwoPowerOfN(q, num - 1);
    }
    /**
     *8.A natural number&gt; = 2 is specified. Expand it into prime factors.
     */
    public static void printExpandIntoPrimeFactors(int n) {

        while (n % 2 == 0) {

            n /= 2;

            System.out.print(2 + " ");
        }

        for (int i = 3; i < n / 2; i += 2) {

            while (n % i == 0) {

                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2)
            System.out.println(n);
    }
    /**
     * 9*Two numbers n and m are given. Create a two-dimensional array A [n] [m], fill it with the
     * multiplication table A [i] [j] = i * j and display it. In this case, you cannot use nested loops, the entire
     * filling of the array must be done in one cycle.
     */


    public static int[][] twoDimensionalMult(int n, int m) {
        int[][] matrix = new int[n][m];
        int j = 0;
        for (int i = 0; i < n; i++) {
            matrix[i][j] = matrix[j][i] = i * j;
            j++;
            --i;
            if (j == m) {
                j = 0;
                i++;
            }

        }
        return matrix;

    }
    /**
     *13.Given numbers n and m. Create an array A [n] [m] and fill it with a snake.
     *      */


    public static int[][] matrixEx2(int n, int m) {
     int[][] arr = new int[n][m];
     for (int i = 0; i < n; i++) {
     if (i % 2 == 0) {
     for (int j = 0; j < m; j++) {

     arr[i][j] = i * 10 + j;
     }
     } else {
     for (int j = 0; j < m; j++) {

     arr[i][j] = i * 10 + m - 1 - j;
     }
      }
        }

     return arr;
     }



}


