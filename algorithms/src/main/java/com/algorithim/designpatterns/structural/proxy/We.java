package com.algorithim.designpatterns.structural.proxy;

public class We implements InternetServiceProvider{
    @Override
    public String serveSite(String url) {
        return String.format("http://www.%s.com",url);
    }
}
