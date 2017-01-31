package com.sunshine1027.test.command;

import com.sunshine1027.command.*;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class CommandTest {
    @Test
    public void test() {
        Receiver receiver = new BuyReceiver();
        Command command = new BuyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.runCommand();
        invoker.runCommand();
        invoker.rollBackCommand();
    }
}
