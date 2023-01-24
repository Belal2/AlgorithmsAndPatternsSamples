package com.algorithim.designpatterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider{
    private List<String> blockedList = Arrays.asList("facebook","twitter");
    @Override
    public String serveSite(String url) {
        if(blockedList.contains(url))
            return String.format("this site %s is blocked ",url);
        return new We().serveSite(url);
    }
}
