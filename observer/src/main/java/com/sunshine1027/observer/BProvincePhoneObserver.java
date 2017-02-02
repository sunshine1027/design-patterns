package com.sunshine1027.observer;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class BProvincePhoneObserver extends PhoneObserver{
    @Override
    public void update(State state) {
        System.out.println("B province. The phone from is " + state.name() + " now.");
    }
}
