package com.sunshine1027.decorator;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class BoheaTea implements Tea {
    private GreenTea greenTea;

    public BoheaTea(GreenTea greenTea) {
        this.greenTea = greenTea;
    }

    @Override
    public void getCup() {
        System.out.println("before get a cup, bohea tea need do something");
        greenTea.getCup();
    }

    @Override
    public void putTea() {
        System.out.println("wash the cup");
        greenTea.putTea();
    }

    @Override
    public void steam() {
        greenTea.steam();
    }

    @Override
    public void drink() {
        greenTea.drink();
    }

    public void action() {
        getCup();
        putTea();
        steam();
        drink();
    }
}
