package com.algorithim.designpatterns.creational.factory;

public class SandwitchFactory {
    public static final int CHEES_BURGER = 1;
    public static final int Checken_BURGER = 2;

    public static  Sandwitch createSandwithch(int sandNumber)
    {
        switch (sandNumber)
        {
            case 1: return new CheeseBurger();
            case 2: return new CheckenBurger();
            default:return null;
        }
    }
}
