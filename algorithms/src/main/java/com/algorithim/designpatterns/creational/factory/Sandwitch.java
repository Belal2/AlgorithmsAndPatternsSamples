package com.algorithim.designpatterns.creational.factory;

public class Sandwitch {
    private String name;
    private int calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void prepare()
    {
        System.err.println(name+" is prepared with "+calories+" Calories");
    }
}
