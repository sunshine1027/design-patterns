package com.sunshine1027.adapter.classadapter;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Adapter extends Adaptee implements Target{
    public void method2() {
        System.out.println("adapter method2");
    }

    public void method3() {
        System.out.println("adapter method3");
    }
}
