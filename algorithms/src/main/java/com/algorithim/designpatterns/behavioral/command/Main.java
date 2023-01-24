package com.algorithim.designpatterns.behavioral.command;

public class Main {
    public final static int TV_SLOT = 0;
    public final static int AIR_CONDITION_SLOT = 1;
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Television tv = new Television();
        TurnOnTv turnOnTv = new TurnOnTv(tv);
        TurnOffTV turnOffTV = new TurnOffTV(tv);
        AirCondition air = new AirCondition();
        TurnOnAirCondition turnOnAirCondition = new TurnOnAirCondition(air);
        TurnOffAirCondition turnOffAirCondition = new TurnOffAirCondition(air);
        remote.addCommand(TV_SLOT,turnOnTv,turnOffTV);
        remote.addCommand(AIR_CONDITION_SLOT,turnOnAirCondition,turnOffAirCondition);
        remote.onButtonPressed(TV_SLOT);
        remote.offButtonPressed(AIR_CONDITION_SLOT);
    }
}
