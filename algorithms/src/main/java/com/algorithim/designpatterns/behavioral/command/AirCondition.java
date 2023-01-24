package com.algorithim.designpatterns.behavioral.command;

public class AirCondition implements Operations{
    @Override
    public void turnOn() {
        System.err.println("Air Condition is On");
    }

    @Override
    public void turnOff() {
        System.err.println("Air Condition is Off");
    }
}
