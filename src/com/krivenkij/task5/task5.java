package com.krivenkij.task5;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the size of sequence: ");
        int size = sc.nextInt();
        int[] seq = new int[size];
        for (int k = 0; k < size; k++){
            System.out.print("Enter " + k + " element out of " + (seq.length - 1) + ": ");
            seq[k] = sc.nextInt();
        }
        System.out.println(Arrays.toString(seq));
        //int[] seq = {4, 5, 3, 2, 1, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7};
        System.out.print("Minimum number of deleted items: " + getMinCountOfDelElem(seq));
    }

    public static int getMinCountOfDelElem(int[] seq) {
        int maxSecIncLen = 0;
        int curSecIncLen;
        for (int i = 0; i < seq.length; i++) {
            curSecIncLen = 1;
            for (int j = i; j < seq.length - 1; j++){
                if (seq[j] < seq[j+1]) {
                    curSecIncLen++;
                }
                else{
                    break;
                    }
            }
        maxSecIncLen = Math.max(maxSecIncLen, curSecIncLen);
        }
        return seq.length - maxSecIncLen;
    }
}
