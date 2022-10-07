package com.krivenkij.task4;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = createArr(sc);
        System.out.println(Arrays.toString(arr));
        printPrimeElements(arr);
    }

    private static boolean isPrime(int elem){
        if (elem < 2)
            return false;
        double s = sqrt(elem);
        for (int i = 2; i <= s; i++) {
            if (elem % i == 0)
                return false;
        }
        return true;
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

    private static void printPrimeElements(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (isPrime(arr[i]))
                System.out.println("Element N" + i + "[" + arr[i] + "] is prime number!");
        }
    }

}
