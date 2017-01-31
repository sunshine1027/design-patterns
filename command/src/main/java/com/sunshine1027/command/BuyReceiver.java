package com.sunshine1027.command;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class BuyReceiver extends Receiver{
    @Override
    public void execute() {
        buySomething();
    }

    @Override
    public void rollback() {
        stopShopping();
    }

    public void buySomething() {
        System.out.println("BuyReceiver buy something now.");
    }

    public void stopShopping() {
        System.out.println("BuyReceiver stop shopping.");
    }
}
