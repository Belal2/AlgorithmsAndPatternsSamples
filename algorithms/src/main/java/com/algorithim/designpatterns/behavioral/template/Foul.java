package com.algorithim.designpatterns.behavioral.template;

public class Foul extends SandwitchTemplate{
    @Override
    protected void addComponent() {
        System.err.println("Now add Foul to your Sandwitch");
    }
}
