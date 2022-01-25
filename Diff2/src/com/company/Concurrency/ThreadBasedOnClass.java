package com.company.Concurrency;

public class ThreadBasedOnClass extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("BasedOnClass " + i);
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
