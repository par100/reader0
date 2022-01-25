package com.company.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread2 thread2 = new Thread2();

        new Thread(thread2).start();
        List<Callable> list = new ArrayList<>();
//        list.add(thread2);
        list.add(new AdapterRunnableToCallable(thread2));
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i < 16; i++) {
            System.out.println(i);
        }
    }
}

class AdapterRunnableToCallable implements Callable {
    Runnable runnable;

    public AdapterRunnableToCallable(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}