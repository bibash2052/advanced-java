package com.bibash.thread_class;

public class ThreadExample extends Thread{

    @Override
    public void run() {
        int i = 1;
        while (i <= 1000) {
            System.out.println(i + " " + this.getName());
            i++;
        }
    }
}
