package com.krivenkij.task3;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("F(x) = tan(x), [a, b], ");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter h: ");
        double h = sc.nextDouble();
        printResult(a, b, h);
    }

    private static void printResult(double a, double b, double h){
        System.out.println("X        F(X)");
        for (double i = a; i <= b; i += h){
            System.out.printf("%f %f\n", i, Math.tan(i));
        }
    }

}
