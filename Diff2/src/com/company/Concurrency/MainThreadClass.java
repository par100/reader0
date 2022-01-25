package com.company.Concurrency;

public class MainThreadClass {
    public static void main(String[] args) {
        ThreadBasedOnClass basedOnClass = new ThreadBasedOnClass();
        ThreadBasedOnInterface basedOnInterface = new ThreadBasedOnInterface();
        System.out.println((Thread.currentThread().getName()));
        new Thread(basedOnInterface).start();
        basedOnClass.start();
    }
}
