package com.sunshine1027.singleton;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ThreadSafeDoubleCheckLockingInstance {
    private static volatile ThreadSafeDoubleCheckLockingInstance instance;

    private ThreadSafeDoubleCheckLockingInstance() {
    }

    public static ThreadSafeDoubleCheckLockingInstance getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeDoubleCheckLockingInstance.class) {
                //double check
                if (instance == null) {
                    instance = new ThreadSafeDoubleCheckLockingInstance();
                }
            }
        }
        return instance;
    }
}
