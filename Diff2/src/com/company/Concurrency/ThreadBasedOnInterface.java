package com.company.Concurrency;

import static java.lang.Thread.sleep;

public class ThreadBasedOnInterface implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("BasedOnInterface " + i);
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
