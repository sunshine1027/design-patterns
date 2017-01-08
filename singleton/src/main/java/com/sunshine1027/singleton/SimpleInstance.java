package com.sunshine1027.singleton;

/**
 * simple singleton
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class SimpleInstance {
    private static final SimpleInstance instance = new SimpleInstance();

    /**
     * make it private
     */
    private SimpleInstance() {

    }

    public static SimpleInstance getInstance() {
        return instance;
    }
}
