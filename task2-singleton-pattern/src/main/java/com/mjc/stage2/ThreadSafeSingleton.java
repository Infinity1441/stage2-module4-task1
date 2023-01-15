package com.mjc.stage2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeSingleton {
    // Write your code here!
    private static Lock lock = new ReentrantLock();
    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        lock.lock();
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        lock.unlock();
        return instance;
    }
}