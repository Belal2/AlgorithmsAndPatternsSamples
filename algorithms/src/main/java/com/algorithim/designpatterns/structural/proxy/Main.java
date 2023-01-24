package com.algorithim.designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        InternetServiceProvider provider = new InternetProxy();
        System.err.println( provider.serveSite("google"));;
        System.err.println( provider.serveSite("facebook"));
    }
}
