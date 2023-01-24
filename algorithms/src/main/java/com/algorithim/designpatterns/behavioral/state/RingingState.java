package com.algorithim.designpatterns.behavioral.state;

public class RingingState implements MobileAlertState{
    @Override
    public void alert() {
        System.err.println("Mobile is Ringging now");
    }
}
