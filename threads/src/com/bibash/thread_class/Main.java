package com.bibash.thread_class;

public class Main {
    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        threadExample.setName("Mythread");
        threadExample.start();

        ThreadExample threadExample1 = new ThreadExample();
        threadExample1.setName("Mythread1");
        threadExample1.start();
    }
}
