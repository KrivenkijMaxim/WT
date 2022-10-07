package com.krivenkij.task_9_11;

import java.awt.*;

public class task {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(Color.BLUE, 11));
        basket.addBall(new Ball(Color.RED, 13));
        basket.addBall(new Ball(Color.BLUE, 13));
        System.out.println("Count of blue balls: " + basket.getCountOfBlueBalls());
        System.out.println("Weight of balls in basket: " + basket.getSumWeight());
    }

}
