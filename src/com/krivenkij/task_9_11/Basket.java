package com.krivenkij.task_9_11;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> listOfBalls;

    public Basket() {
        this.listOfBalls = new ArrayList<>();
    }

    public void addBall(Ball ball){
        listOfBalls.add(ball);
    }

    public int getSumWeight(){
        int weightSum = 0;
        for(Ball ball : listOfBalls){
            weightSum += ball.getWeight();
        }
        return weightSum;
    }

    public int getCountOfBlueBalls() {
        int count = 0;
        for (Ball ball : listOfBalls) {
            if (ball.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }

}
