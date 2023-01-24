package com.algorithim.designpatterns.structural.adapter;

public class ByscleAdapter implements Vehicle {
    Bike bike;

    public ByscleAdapter(Bike bike) {
        this.bike = bike;
    }


    @Override
    public void moving() {
        this.bike.move();
    }

    @Override
    public void stopping() {
        this.bike.stop();
    }

    @Override
    public void soundBeek() {
        this.bike.bell();
    }
}
