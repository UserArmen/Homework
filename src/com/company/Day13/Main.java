package com.company.Day13;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        matrixDiagonalOne2(16);
    }
    public static void printMaxAndIndex(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("max: " + max + " index: " + index);
    }
    /**
     * 1.Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left
     * corner are equal to 1;
     * - the other elements are 0;
     * - print matrix
     *
     * @param array
     */

    public static void printMatrix(int[][] array) {
        for (int[] arr : array) {
            for (int j : arr) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void matrixDiagonalOne(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1 - i) {
                    array[i][j] = 1;
                } else array[i][j] = 0;
            }
        }
        printMatrix(array);

    }
    /**
     * 2
     */

    public static void matrixDiagonalOne2(int size) {
        boolean diaganal;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            diaganal = false;
            for (int j = 0; j < size; j++) {
                if (j == size - 1 - i) {
                    array[i][j] = 1;
                    diaganal = true;
                }
                else if (diaganal) {
                    array[i][j] = 2;
                }
            }
        }
        printMatrix(array);
    }

    /**
     * 3
     */
    public static void checkSymmetric(int[][] array) {
        boolean symmetric = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != array[j][i] || array[i][i] != array[j][j]) {
                    symmetric = false;
                }
            }
        }
        System.out.println(symmetric ? "Yes" : "No");
    }

    /**
     * 4
     */
    public static int[][] generateArray(int n, int m) {
        Random random = new Random();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(10);
            }
        return array;
    }

    public static void rowElementsSumMax(int n, int m) {

        int[][] array = generateArray(n, m);
        printMatrix(array);
        int[] sumOfEachRow = new int[n];
        int sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
            }
            sumOfEachRow[i] = sum;
        }
        printMaxAndIndex(sumOfEachRow);
    }
    /**
     * 5
     */
    public static void maxElementInMatrix(int n,int m ){
        int[][] array = generateArray(n, m);
        printMatrix(array);
        int max=0;
        int row=0,column=0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if(array[i][j]>max) {
                    max = array[i][j];
                    row=i;
                    column=j;
                }
            }
        System.out.println(max+"   "+row+"   "+column);
    }

    /**
     * 6
     */
    public static void maxAndSumMax(int n,int m){
        int[][] array = generateArray(n, m);
        printMatrix(array);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {

            }
    }

    public static int[][] reverse180(int[][] array){
        printMatrix(array);
        System.out.println();
        int n=array.length;
        int m=array[0].length;
        int[][] reverseArray=new int[n][m];
        for (int i = n-1; i >=0; i--)
            for (int j = m-1; j >=0; j--) {
                reverseArray[n-1-i][m-1-j]=array[i][j];
            }
        return reverseArray;
    }


    /**
     *8
     */
    public static int[][] sum(int[][] arr1,int[][] arr2){
        printMatrix(arr1);
        System.out.println("______________");
        printMatrix(arr2);
        System.out.println("______________");
        int n=arr1.length;
        int m=arr1[0].length;
        int[][] sum=new int [n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        return sum;
    }

}


