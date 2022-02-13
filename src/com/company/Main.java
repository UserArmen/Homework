package com.company;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) {
            }

    /** 1.1
     *
     * Write a java program, which has 2 String variables, initialize them from console.
     * - - Compare them with == assignment
     * - - Compare them with equals to
     */
    static boolean compareStr(String a,String b){
        return a==b;
    }

    static boolean compare_Str(String a, String b){
        return a.equals(b);
    }

     /**1
     *  Write a java program, which has 2 String variables, initialize them, One with literal,
      * another using new keyword
      * - - Compare them with == assignment
      * - - Compare them with equals to
     */
     static boolean isCompare_StrNew(  String a, String b){
        a = new String();
        return a==b;

     }
        static boolean compare_StrNew(String a, String b){
         a = new String();
         return a.equals(b);
        }

    /**2
     *
     Input integer value from console, if value greater than 0 print n positive, else
     print negative.
     */
    static String positiveAndNegative(int a){
        if (a<0){
            return a + new String("Negative");
        }else {
            return a+ new String("Positive");
        }
        }


    static String positiveNegative(int a){
        if (a<0){
            return a + new String(" - Negative");
        }else if(a==0){
            return a + new String(" - 0");
        }
        else {
            return a+ new String(" - Positive");
        }
    }

    /**3
     *
     *Using ternary operator`
     * - - achieve Math.max(a,b) function
     * - - achieve Math.abs(a) function
     */
    static String mathMax(int a, int  b){
        int max = a > b ? a : b;

        int abs = a>=0? a:-a;
        return new String(" a and b max " + max + "abs" + abs);

    }

    /**4
     Using ternary operator check if the given String
     - - is a null so return -1
     - - if given String is “ ” return 0
     - - else return 1
     */
    static int checkString(String a){
        int tern = a.equals("null")? -1: a.equals(" ")? 0:1;
        return tern;
    }

    /**5
     *
     *Write a java program to find maximum from a given 3 integer numbers using ternary
     * operator.Input numbers from console
     */
    static int maximum(int a,int b, int c){
        int max = a>b&&a>c? a: b>a&&b>c? b:c;
        return max;
    }

    /**
     *6.Write a Java program that allows the user to choose the correct answer of a question.If
     * he choose correct answer Print “Congratulation”,
     * in case of illegal choice print “Invalide choice”.
     *
     */
    public static void chooseCorrectAnswer(char x) {


        switch (x) {

            case 'a':

                System.out.println("Invalide choice");
                break;

            case 'b':

            case 'c':
                System.out.println("Congratulation");
                break;

            case 'd':

                System.out.println("Invalide choice");

            default:
                System.err.println("this character mistake value!!!");

        }
    }

    /**
     * 10.Write Java Program to check Vowel or Consonant using Switch Case.
     */
    static void isVowel(String a){
        switch (a){
            case "a":
                System.out.println("Vowel");
                break;
            case "u":
                System.out.println("Vowel");
                break;
            case "i":
                System.out.println("Vowel");
                break;
            case "o":
                System.out.println("Vowel");
                break;
            case "e":
                System.out.println("Vowel");
                break;
            case "y":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");


        }
    }

    /**10.2
     *If the user pressed number keys( from 0 to 9), the program will tell the number that is
     * pressed, otherwise, the program will show &quot;Not allowed&quot;.
     */
    static String presNumber(int x){
        switch (x){
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            default:
                return "Not Allowed ";



        }
    }

    /**
     11.Using switch statements determine if the number is even or odd.
     Input number from console
     */
    static String evenOdd(int x){{
          switch (x%2){
              case 0:
                  return " Even ";
              default: return "odd";
          }

    }

    }

    /**
     * Program to make a calculator using switch case in Java
     * In this Program we are making a simple calculator that performs addition, subtraction, multiplication and
     * division based on the user input. The program takes the value of both the numbers (entered by user) and
     * then user is asked to enter the operation (+, -, * and /), based on the input program performs the selected
     * operation on the entered numbers using switch case.
     *
     */
    static double calculator (double first,String operator, double second ){
        switch (operator){
            case "+":
                return first+second;
            case "-":
                return first-second;
            case "*":
                return first*second;
            case "/":
                return first /second;
            default: return 0;

        }

    }

    /**
     * 13.Given the String variable day holding the name of the weekday Sunday, Monday, etc., set an int variable to 1, 2,
     * etc.
     *
     */
    static String numWeekday(int n){
        switch (n){
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "error";
        }

    }
    static boolean isPowerOf2(int num) {

return (num&(num-1))==0;
}


}
