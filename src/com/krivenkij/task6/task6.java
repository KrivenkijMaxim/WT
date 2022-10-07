package com.krivenkij.task6;

import java.util.Arrays;
import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = createArr(sc);
        System.out.println(Arrays.toString(arr));
        int[][] matr = createMatrix(arr);
        printMatrix(matr);
    }


    private static int[] createArr(Scanner sc){
        System.out.print("Please, enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter the element N" + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static int[][] createMatrix(int[] arr) {
        int size = arr.length;
        int[][] matrix = new int[size][size];
        int jump = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = arr[(j + jump) % size];
            }
            jump++;
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
