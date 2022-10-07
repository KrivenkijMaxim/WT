package com.krivenkij.task8;

import java.util.Arrays;

public class task8 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {0, 2, 4, 90};
        System.out.println(Arrays.toString(findInsInd(arr1, arr2)));
    }


    private static int[] findInsInd(int[] arr1, int[] arr2){
        int[] ind = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            boolean isIns = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] < arr1[j]) {
                    ind[i] = j - 1;
                    isIns = true;
                    break;
                }
            }
            if (!isIns) {
                ind[i] = arr1.length - 1;
            }
        }
        return ind;

    }

}
