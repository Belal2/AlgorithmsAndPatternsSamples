package com.algorithim.designpatterns.behavioral.command;

public class TurnOffTV implements Command {
    Television tv;

    public TurnOffTV(Television tv)
    {
        this.tv = tv;
    }


    @Override
    public void execute() {
        this.tv.turnOff();
    }
}
