package com.algorithim.designpatterns.structural.decorator;

public class Beef extends SandwitchDecorator {

    public Beef(Sandwitch sandwitch) {
        super(sandwitch);
    }

    @Override
    public double getCost() {
        return super.getCost()+10;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Beef";
    }
}
