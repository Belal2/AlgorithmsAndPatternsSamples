package com.algorithim.designpatterns.creational.singileton;

import java.util.List;

public class Single {
    private List<Integer> numbers = List.of(1,2,3,4,5,6,7);

    private static Single instance;

    public static Single getInstance()
    {
        if(instance == null)
            instance = new Single();
        return instance;
    }
    private Single()
    {
        System.err.println("Object Created");
        System.err.println(this.hashCode());
    }

    public void printDate()
    {
        System.err.println("\n");
        numbers.forEach(v-> System.err.print(v));
    }
}
