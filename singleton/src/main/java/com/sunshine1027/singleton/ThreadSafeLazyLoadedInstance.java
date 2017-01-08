package com.sunshine1027.singleton;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ThreadSafeLazyLoadedInstance {
    private static ThreadSafeLazyLoadedInstance instance;

    private ThreadSafeLazyLoadedInstance() {
    }

    public static synchronized ThreadSafeLazyLoadedInstance getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedInstance();
        }
        return instance;
    }
}
