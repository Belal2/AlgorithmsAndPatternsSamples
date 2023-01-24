package com.algorithim.designpatterns.structural.adapter;

public class Bike {
    public void move()
    {
        System.err.println("Bike Moving ..");
    }
    public void stop(){
        System.err.println("Bike Stopped ...");
    }

    public void bell()
    {
        System.err.println("bell running");
    }

}
