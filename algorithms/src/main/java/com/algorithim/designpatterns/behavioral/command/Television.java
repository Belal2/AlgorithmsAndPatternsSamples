package com.algorithim.designpatterns.behavioral.command;

public class Television implements Operations{

    @Override
    public void turnOn() {
        System.err.println(" Tv is turn on");
    }

    @Override
    public void turnOff() {
        System.err.println("TV is turn off");
    }


}
