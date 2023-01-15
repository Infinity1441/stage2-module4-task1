package com.mjc.stage2;

public class ThreadSafeSingleton {
    // Write your code here!
    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
    }

    public synchronized static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}