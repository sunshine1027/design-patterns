package com.sunshine1027.observer;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class AProvincePhoneObserver extends PhoneObserver{
    @Override
    public void update(State state) {
        System.out.println("A province. The phone from is " + state.name() + " now.");
    }
}
