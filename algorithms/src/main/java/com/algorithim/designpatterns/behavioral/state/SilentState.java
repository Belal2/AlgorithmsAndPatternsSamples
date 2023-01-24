package com.algorithim.designpatterns.behavioral.state;

public class SilentState implements MobileAlertState{
    @Override
    public void alert() {
        System.err.println("Mobile is Silent now");
    }
}
