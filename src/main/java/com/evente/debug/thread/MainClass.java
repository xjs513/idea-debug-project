package com.evente.debug.thread;

import java.util.concurrent.TimeUnit;

public class MainClass {


    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "曹操");
        Thread thread2 = new Thread(new MyRunnable(), "刘备");
        Thread thread3 = new Thread(new MyRunnable(), "孙权");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "______进入");
        try {
            TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "______离开");
    }
}

