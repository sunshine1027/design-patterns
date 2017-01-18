package com.sunshine1027.decorator;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class GreenTea implements Tea{
    @Override
    public void getCup() {
        System.out.println("get a cup for green tea");
    }

    @Override
    public void putTea() {
        System.out.println("put green tea in to a cup");
    }

    @Override
    public void steam() {
        System.out.println("steam...");
    }

    @Override
    public void drink() {
        System.out.println("drink green tea");
    }

    public void action() {
        getCup();
        putTea();
        steam();
        drink();
    }
}
