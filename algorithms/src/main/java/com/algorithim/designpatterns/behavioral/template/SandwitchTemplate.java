package com.algorithim.designpatterns.behavioral.template;

import java.time.chrono.IsoEra;

public abstract class SandwitchTemplate {

    public final void buildSandwitch()
    {
        prepareBread();
        addComponent();
        closeSandwitchAndEatIt();
    }

    protected abstract void addComponent();

    private void prepareBread() {
        System.err.println("Bring bread and add Component");
    }

    private void closeSandwitchAndEatIt() {
        System.err.println(" Good Job now you should close your sandwitch and eat humm ya gammal");
    }
}
