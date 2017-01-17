package com.sunshine1027.composite;

import org.junit.Test;


/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class CompositeTest {
    @Test
    public void test() {
        Level1Point level1Point0 = new Level1Point();
        level1Point0.add(new Level2Point(0));
        level1Point0.add(new Level2Point(1));
        level1Point0.add(new Level2Point(2));

        Level1Point level1Point1 = new Level1Point();
        level1Point1.add(new Level2Point(10));
        level1Point1.add(new Level2Point(11));
        level1Point1.add(new Level2Point(12));

        RootPoint rootPoint = new RootPoint();
        rootPoint.add(level1Point0);
        rootPoint.add(level1Point1);
        System.out.print(rootPoint.toString());
    }
}
