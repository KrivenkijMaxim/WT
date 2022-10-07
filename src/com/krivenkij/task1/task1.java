package com.krivenkij.task1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        double x = sc.nextDouble();
        System.out.print("Enter Y: ");
        double y = sc.nextDouble();
        System.out.println("Task result one: " + calculateTaskOne(x, y));
    }

    private static double calculateTaskOne(double x, double y){
        return 1 + (Math.pow(Math.sin(x + y), 2)) / ((2 + Math.abs(x - (2 * x) / (1 + x * x * y * y))) + x);
    }
}
