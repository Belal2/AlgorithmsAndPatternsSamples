package com.algorithim.designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        Sandwitch s = SandwitchFactory.createSandwithch(SandwitchFactory.CHEES_BURGER);
        s.prepare();
        Sandwitch s2 = SandwitchFactory.createSandwithch(SandwitchFactory.Checken_BURGER);
        s2.prepare();
    }
}
