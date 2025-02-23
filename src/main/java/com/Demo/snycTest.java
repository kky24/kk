package com.Demo;

public class snycTest {
    static final Object lock = new Object();
    static int i = 1;

    public static void main(String[] args) {
        synchronized (lock) {
            System.out.printf(String.valueOf(i++));
        }
    }
}
