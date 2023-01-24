package com.algorithim.designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        useVehicle(car);
        Vehicle bike =  new ByscleAdapter(new Bike());
        useVehicle(bike);
    }

    private static void useVehicle(Vehicle vehicle)
    {
        vehicle.moving();
        vehicle.stopping();
        vehicle.soundBeek();
    }
}
