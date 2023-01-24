package com.algorithim.designpatterns.creational.singileton;

public class Main {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        s1.printDate();
        Single s2 =Single.getInstance();
        s2.printDate();

        Single s3 =Single.getInstance();
        s3.printDate();
    }
}
