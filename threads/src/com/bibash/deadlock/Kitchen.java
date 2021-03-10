package com.bibash.deadlock;

public class Kitchen {

    public static final Object spoon = new Object();
    public static final Object bowl = new Object();

    public static void main(String[] args) {
        Thread cook1 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Cook1: holding spoon");
                System.out.println("Cook1: waiting for bowl");

                synchronized (bowl) {
                    System.out.println("Cook1: Holding spoon and the bowl");
                }
            }
        });

        Thread cook2 = new Thread(() -> {
            synchronized (bowl) {
                System.out.println("Cook2: holding bowl");
                System.out.println("Cook2: waiting for spoon");

                synchronized (spoon) {
                    System.out.println("Cook2: Holding spoon and the bowl");
                }
            }
        });

        cook1.start();
        cook2.start();

    }
}
