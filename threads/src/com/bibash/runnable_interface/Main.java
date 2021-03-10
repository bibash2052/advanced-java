package com.bibash.runnable_interface;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableExample());
        thread.start();

        Thread thread1 = new Thread(() -> {
            int i = 0;
            while (i <= 100) {
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            }
        });
        thread1.start();
    }
}
