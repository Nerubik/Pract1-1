package ru.mirea.inbo2;

import java.lang.System;

public class Ball {

    private String color;
    private double raduis;


    public Ball(String color, double raduis){
        this.color = color;
        this.raduis = raduis;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getRaduis(){
        return raduis;
    }
    public void setRadius(double raduis){
        this.raduis = raduis;
    }

    public  String toString(){
        return this.raduis+", color: "+this.color;

    }
}
