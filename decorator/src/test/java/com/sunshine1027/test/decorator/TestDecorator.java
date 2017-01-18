package com.sunshine1027.test.decorator;

import com.sunshine1027.decorator.BoheaTea;
import com.sunshine1027.decorator.GreenTea;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class TestDecorator {
    @Test
    public void test() {
        GreenTea greenTea = new GreenTea();
        BoheaTea boheaTea = new BoheaTea(greenTea);

        greenTea.action();
        System.out.println("----------------------");
        boheaTea.action();
    }

}
