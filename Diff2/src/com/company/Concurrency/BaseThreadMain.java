package com.company.Concurrency;

import com.company.Collection.CurrentOrders;

import java.io.Closeable;
public class BaseThreadMain {
    public static void main(String[] args) {
        WalkThread walk = new WalkThread();
        Thread talk = new Thread(new TalkThread());
        talk.start();
        walk.start();
        Integer i = 5;
        String strr = (String) i;
        String s = (String) new Object();
        String st = (String) new CurrentOrders();

    }
}
