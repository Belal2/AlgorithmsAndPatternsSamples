package com.algorithim.designpatterns.behavioral.command;

public class TurnOnAirCondition implements Command{
    AirCondition air;
   public TurnOnAirCondition(AirCondition air)
    {
        this.air = air;
    }
    @Override
    public void execute() {
        this.air.turnOn();
    }
}
