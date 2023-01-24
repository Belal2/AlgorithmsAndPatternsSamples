package com.algorithim.designpatterns.behavioral.template;

public class Cheese extends SandwitchTemplate{
    @Override
    protected void addComponent() {
        System.err.println("now we will add Cheese sandwitch ");
    }
}
