package com.sunshine1027.test.prototype;

import com.alibaba.fastjson.JSON;
import com.sunshine1027.prototype.DeepClone;
import com.sunshine1027.prototype.Factory;
import com.sunshine1027.prototype.ShallowClone;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class PrototypeTest {
    private DeepClone deepClone = null;
    private ShallowClone shallowClone = null;
    @Before
    public void init() {
        Factory deepCloneFactory = new Factory("deepCloneFactoryName");
        deepClone = new DeepClone("deepType", deepCloneFactory);

        Factory shallowCloneFactory = new Factory("shallowCloneFactoryName");
        shallowClone = new ShallowClone("shallowType", shallowCloneFactory);
    }

    @Test
    public void testDeepClone() {
        DeepClone deepCloneCopy = (DeepClone) deepClone.clone();
        Factory factory = deepClone.getFactory();
        factory.setFactoryName("newFactoryName");
        System.out.println("origin:" + JSON.toJSONString(deepClone));
        System.out.println("copy:" + JSON.toJSONString(deepCloneCopy));
    }

    @Test
    public void testShallowClone() {
        ShallowClone shallowCloneCopy = (ShallowClone) shallowClone.clone();
        Factory factory = shallowClone.getFactory();
        factory.setFactoryName("newFactoryName");
        System.out.println("origin:" + JSON.toJSONString(shallowClone));
        System.out.println("copy:" + JSON.toJSONString(shallowCloneCopy));
    }
}
