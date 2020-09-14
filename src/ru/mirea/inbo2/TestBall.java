package ru.mirea.inbo2;
import java.lang.System;
public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball("Green", 2.4);
        Ball b2 = new Ball("Green", 2.4);
        b2.setColor("Red");
        System.out.println(b1);
        System.out.println(b2);
    }

}