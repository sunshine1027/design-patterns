package com.sunshine1027.factorymethod;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class AToyFactory implements IToyFactory {

    public IToy createToy(String msg) {
        return new AToy(msg);
    }
}
