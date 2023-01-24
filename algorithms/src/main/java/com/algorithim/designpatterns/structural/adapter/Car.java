package com.algorithim.designpatterns.structural.adapter;

public class Car implements Vehicle{
    @Override
    public void moving() {
        System.err.println(" Car Move ..");
    }

    @Override
    public void stopping() {
        System.err.println("Car Stopped ....");
    }

    @Override
    public void soundBeek() {
        System.err.println(" Beep Beep ...");
    }
}
