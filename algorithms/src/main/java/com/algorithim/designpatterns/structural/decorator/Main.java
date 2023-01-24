package com.algorithim.designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Sandwitch sandwitch = new Beef(new BasicSandwitch());
        System.err.println(sandwitch.getCost() + " "+sandwitch.getDescription());
    }
}
