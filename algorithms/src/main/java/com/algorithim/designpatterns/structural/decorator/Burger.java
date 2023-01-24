package com.algorithim.designpatterns.structural.decorator;

public class Burger extends SandwitchDecorator{
    public Burger(Sandwitch sandwitch) {
        super(sandwitch);
    }

    @Override
    public double getCost() {
        return super.getCost()+50;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" , Buger";
    }
}
