package com.algorithim.designpatterns.behavioral.command;

public class TurnOffAirCondition implements Command{
    AirCondition air;
    public TurnOffAirCondition(AirCondition air)
    {
        this.air = air;
    }
    @Override
    public void execute() {
        this.air.turnOff();
    }
}
