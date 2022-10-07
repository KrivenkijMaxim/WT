package com.krivenkij.task2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the point coordinates.");
        System.out.print("X: ");
        double x = sc.nextDouble();
        System.out.print("Y: ");
        double y = sc.nextDouble();
        System.out.println("Result: " + isContains(x, y));
    }

    private static boolean isContains(double x, double y){
        return ((x >= -4 && x <= 4) && (y >= 0 && y <= 5)) || ((x >= -6 && x <= 6) && (y >= -3 && y <= 0));
    }
}
