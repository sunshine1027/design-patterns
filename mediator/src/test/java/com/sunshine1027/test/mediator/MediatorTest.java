package com.sunshine1027.test.mediator;

import com.sunshine1027.mediator.*;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class MediatorTest {
    @Test
    public void test() {
        ConcreteMediator mediator = new ConcreteMediator();
        KFC kfc = new KFC(mediator, BigDecimal.valueOf(15));
        MacDonald macDonald = new MacDonald(mediator, BigDecimal.valueOf(11));
        mediator.setKfc(kfc);
        mediator.setMacDonald(macDonald);

        kfc.changePrice();

        macDonald.changePrice();
    }
}
