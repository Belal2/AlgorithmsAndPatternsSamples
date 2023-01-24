package com.algorithim.designpatterns.behavioral.state;

public class MobileContext {
    private MobileAlertState currentState;

    MobileContext()
    {
        currentState = new RingingState();
    }

    public void setCurrentState(MobileAlertState currentState) {
        this.currentState = currentState;
    }

    public void alert(){
       this.currentState.alert();
    }
}
