package com.sunshine1027.test.factorymethod;

import com.alibaba.fastjson.JSON;
import com.sunshine1027.factorymethod.AToyFactory;
import com.sunshine1027.factorymethod.BToyFactory;
import com.sunshine1027.factorymethod.IToy;
import com.sunshine1027.factorymethod.IToyFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class FactoryMethodTest {
    @Test
    public void testFactoryMethod() {
        IToyFactory aToyFactory = new AToyFactory();
        IToy aToy = aToyFactory.createToy("hello");
        Assert.assertEquals("Ahello", aToy.showInfo());

        IToyFactory bToyFactory = new BToyFactory();
        IToy bToy = bToyFactory.createToy("hello");
        Assert.assertEquals("Bhello", bToy.showInfo());
    }
}
