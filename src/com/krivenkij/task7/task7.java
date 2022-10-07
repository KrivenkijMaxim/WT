package com.krivenkij.task7;

import java.util.Arrays;
import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = createArr(sc);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(shellSort(arr)));
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

    private static int[] shellSort(int[] arr){
        int i = 0;
        while(i < arr.length - 1){
            if(arr[i] <= arr[i + 1])
                i++;
            else{
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                if(i != 0)
                    i--;
            }
        }
        return arr;
    }
}
