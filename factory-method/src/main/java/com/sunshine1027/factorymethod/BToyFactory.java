package com.sunshine1027.factorymethod;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class BToyFactory implements IToyFactory{
    @Override
    public IToy createToy(String msg) {
        return new BToy(msg);
    }
}
