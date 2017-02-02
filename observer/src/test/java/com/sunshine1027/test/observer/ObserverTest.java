package com.sunshine1027.test.observer;

import com.google.common.collect.Lists;
import com.sunshine1027.observer.*;
import org.junit.Test;


/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ObserverTest {

    @Test
    public void test() {
        Phone phone = new Phone();
        phone.setState(State.FREE);
        phone.setObservers(Lists.newArrayList());

        //here should print "There is no observer"
        phone.notifyObservers();

        phone.addObserver(new AProvincePhoneObserver());
        phone.addObserver(new AProvincePhoneObserver());
        phone.addObserver(new BProvincePhoneObserver());

        phone.notifyObservers();

        //change the state to BUSY
        phone.setState(State.BUSY);
        System.out.println("busy style:");
        phone.notifyObservers();
    }
}
