package com.sunshine1027.test.singleton;

import com.sunshine1027.singleton.InitializationOnDemandHolderIdiom;
import com.sunshine1027.singleton.SimpleInstance;
import com.sunshine1027.singleton.ThreadSafeDoubleCheckLockingInstance;
import com.sunshine1027.singleton.ThreadSafeLazyLoadedInstance;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class SingletonTest {
    @Test
    public void test() {
        System.out.println(SimpleInstance.getInstance());
        System.out.println(SimpleInstance.getInstance());

        System.out.println(ThreadSafeLazyLoadedInstance.getInstance());
        System.out.println(ThreadSafeLazyLoadedInstance.getInstance());

        System.out.println(ThreadSafeDoubleCheckLockingInstance.getInstance());
        System.out.println(ThreadSafeDoubleCheckLockingInstance.getInstance());

        System.out.println(InitializationOnDemandHolderIdiom.getInstance());
        System.out.println(InitializationOnDemandHolderIdiom.getInstance());
    }
}
