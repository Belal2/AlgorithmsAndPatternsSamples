package com.algorithim.designpatterns.structural.decorator;

public class SandwitchDecorator implements Sandwitch {
    Sandwitch sandwitch;

    public SandwitchDecorator(Sandwitch sandwitch) {
        this.sandwitch = sandwitch;
    }


    @Override
    public double getCost() {
        return this.sandwitch.getCost();
    }

    @Override
    public String getDescription() {
        return this.sandwitch.getDescription();
    }
}
