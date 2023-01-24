package com.algorithim.designpatterns.behavioral.command;

public class RemoteControl {

    private Command[] onCommand;
    private Command[] offCommand;

    public RemoteControl()
    {
        this.onCommand = new Command[3];
        this.offCommand = new Command[3];
    }

    void addCommand(int slot,Command onCommand,Command offCommand){
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonPressed(int slot)
    {
        this.onCommand[slot].execute();
    }

    public void offButtonPressed(int slot){
        this.offCommand[slot].execute();
    }
}
