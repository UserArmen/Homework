package com.company.Day12;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
printOfMinimum(9);    }

    /**
     * 1.Print all elements of the array with even indices (that is, A [0], A
     * [2], A [4]...)
     * - Input natural integer N
     * - define an array with size N,
     * - Initialize it
     */
    public static void printEvenIndexArrays(int n) {
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    /**
     * 2
     * Print all even numbered items in the list.
     * - Input natural integer N
     * - define an array with size N,
     * - Initialize it
     */
    public static void printEvenArrays(int n) {
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (array[i] % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * 3
     * Find the number of positive elements in the given array.
     * Example` Input` 1 -1 2 3 -8
     * Output 1 2 3
     */
    public static void printPositiveArrays(int n) {
        int array[] = new int[n];
        Random random = new Random();
        if (array == null || array.length == 0) {
            System.out.println("Error");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }

    }

    /**
     * 4
     * A list of numbers is given. Print all the elements of the list that are
     * larger than the previous element.
     */
    public static void printLargerOfArrays(int n) {
        int arrays[] = new int[n];
        Random random = new Random();
        arrays[0] = random.nextInt(30);
        for (int i = 1; i < arrays.length; i++) {
            arrays[i] = random.nextInt(30);
            if (arrays[i - 1] < arrays[i]) {
                System.out.println(arrays[i]);
            }
        }
    }

    /**
     * 5
     * An array of numbers is given. If it has two adjacent(հարևան)
     * elements of the same sign, print these numbers. If there are no
     * adjacent elements of the same character, do not print anything. If there
     * are several such pairs of neighbors, print the first pair.
     */
    public static void printOfFirstPair(int n) {
        Random random = new Random();
        int arrays[] = new int[n];
        arrays[0] = random.nextInt(50);
        for (int i = 1; i < arrays.length; i++) {
            arrays[i] = random.nextInt(200) - 100;
            if (arrays[i] > 0 && arrays[i - 1] > 0 || arrays[i] < 0 && arrays[i - 1] < 0) {
                System.out.println(arrays[i]);
                return;
            }
        }
    }

    /**
     * 6
     * An array of numbers is given. Print the value of the largest element in
     * the array, and then the index of that element in the array. If there are
     * several largest elements, print the index of the first of them.
     */
    public static void printOfMaximum(int n) {
        Random random = new Random();
        int arrays[] = new int[n];
        int count = 0;
        int pointer = 0;
        arrays[0] = random.nextInt(500);
        for (int i = 1; i < arrays.length; i++) {
            arrays[i] = random.nextInt(500);

            if (arrays[0] < arrays[1]) {
                int sum = arrays[1];
                arrays[1] = arrays[0];
                arrays[0] = sum;
                pointer = arrays[0];

            }
            if (arrays[i] > pointer) {
                pointer = arrays[i];
                count = i;
            }
            System.out.println(arrays[i]);
        }

        System.out.println(pointer + "-----------" + count);
    }

    /**
     * 7.Print the value of the smallest of all positive elements in the list. It is
     * known that the list contains at least one positive element, and the
     * absolute value of all elements of the list does not exceed 1000.
     */
    public static void printOfMinimum(int n) {
        int array[] = new int[n];
        Random random = new Random();
        array[0] = random.nextInt(1000) - 500;
        int pointer = 1000;
        for (int i = 1; i < array.length; i++) {
            array[i] = random.nextInt(1000) - 500;
            if (array[0] >= 0 && i == 1) {
                pointer = array[0];
            }
            if (array[i] >= 0) {
                if (array[i] < pointer) {
                    pointer = array[i];
                }
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println(" Min_mum...." + " " + pointer);
    }

    /**
     * 8
     *
     * @param n
     */
    public static void printOfNumArray(int n) {
        int array[] = new int[n];
        Random random = new Random();
        int count = (-n);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.print(array[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int pointer = array[i];
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

        }

        System.out.println(n - (count / 2));
    }

    /**
     * 9
     */
    public static void reversOfNumArrays(int n) {
        Random random = new Random();
        int array[] = new int[n];
        int pointer = n - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(500);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Revers..................");
        for (int i = pointer; i > 0; i--) {
            System.out.print(array[i] + " ");

        }
    }

    /**
     * 10
     */
    public static void reversOfIndexArray(int n) {
        Random random = new Random();
        int array[] = new int[n];
        int pointer = 0;
        int count = n - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(500);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Revers..................");
        for (int i = 0; i < array.length; i++) {
            pointer = array[i];
            array[i] = array[count];
            array[count] = pointer;
            System.out.print(array[i] + " ");
            count--;
        }
    }

    /**
     * 11
     * @param n
     */


}
