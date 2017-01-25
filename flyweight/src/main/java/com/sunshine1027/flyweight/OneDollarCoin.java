package com.sunshine1027.flyweight;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class OneDollarCoin extends Money{
    @Override
    public void show() {
        System.out.println("This is a one dollar coin,hashcode:" + hashCode());
    }
}
