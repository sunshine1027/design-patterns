package com.sunshine1027.test.bridge;

import com.sunshine1027.bridge.*;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class BridgeTest {
    @Test
    public void test() {
        IMouse kondorMouse = new KondorMouse();
        IMouse fanatecMouse = new FanatecMouse();
        ICPU interCPU = new InterCPU();
        ICPU amdCPU = new AMDCPU();

        AbstractComputer sonyComputer1 = new SonyComputer(kondorMouse, interCPU);
        AbstractComputer sonyComputer2 = new SonyComputer(fanatecMouse, interCPU);

        AbstractComputer thinkPad1 = new ThinkPad(kondorMouse, amdCPU);
        AbstractComputer thinkPad2 = new ThinkPad(fanatecMouse, amdCPU);

        sonyComputer1.showComputerMessage();
        sonyComputer2.showComputerMessage();
        thinkPad1.showComputerMessage();
        thinkPad2.showComputerMessage();
    }
}
