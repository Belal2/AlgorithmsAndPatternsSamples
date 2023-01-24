package com.algorithim.designpatterns.structural.decorator;

public class BasicSandwitch implements Sandwitch {


    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Bread ";
    }
}
