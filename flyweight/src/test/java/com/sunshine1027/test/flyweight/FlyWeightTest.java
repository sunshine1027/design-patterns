package com.sunshine1027.test.flyweight;

import com.sunshine1027.flyweight.MintFactory;
import com.sunshine1027.flyweight.Money;
import com.sunshine1027.flyweight.MoneyEnum;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class FlyWeightTest {
    @Test
    public void test() {
        MintFactory factory = new MintFactory();
        Money firstOneDollar = factory.createMoney(MoneyEnum.ONE);
        Money secondOneDollar = factory.createMoney(MoneyEnum.ONE);
        Money firstTenNote = factory.createMoney(MoneyEnum.TEN);
        Money secondTenNote = factory.createMoney(MoneyEnum.TEN);
        Money firstHundredNote = factory.createMoney(MoneyEnum.HUNDRED);
        Money secondHundredNote = factory.createMoney(MoneyEnum.HUNDRED);

        firstOneDollar.show();
        secondOneDollar.show();

        firstTenNote.show();
        secondTenNote.show();

        firstHundredNote.show();
        secondHundredNote.show();
    }
}
