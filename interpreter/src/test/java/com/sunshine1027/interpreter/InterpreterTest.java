package com.sunshine1027.interpreter;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class InterpreterTest {
    Client client = new Client();
    @Test
    public void test() {
        Assert.assertEquals(-16, client.calculate("4 2 7 - 1 + *"));
        Assert.assertEquals(5, client.calculate("12 4 / 2 +"));
    }
}
