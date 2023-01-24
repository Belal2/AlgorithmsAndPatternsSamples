package com.algorithim.designpatterns.behavioral.command;

public class TurnOnTv implements Command {
    Television tv;
    TurnOnTv(Television tv)
    {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOn();
    }
}
