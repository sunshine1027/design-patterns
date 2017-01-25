package com.sunshine1027.flyweight;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class TenDollarNote extends Money{
    @Override
    public void show() {
        System.out.println("This is a ten dollar note,hashcode:" + hashCode());
    }
}
