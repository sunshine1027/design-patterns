package com.sunshine1027.test.proxy;

import com.sunshine1027.proxy.OfflineTicketOffice;
import com.sunshine1027.proxy.dynamic.jdk.MyInvocationHandler;
import com.sunshine1027.proxy.normal.Proxy;
import com.sunshine1027.proxy.TicketOffice;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ProxyTest {
    @Test
    public void testNormalStaticProxy() {
        TicketOffice ticketOffice = new OfflineTicketOffice();
        Proxy proxy = new Proxy(ticketOffice);
        Assert.assertEquals("Buy insurance...Buy a ticket offline.", proxy.buyTicket());
    }

    @Test
    public void testJdkDynamicProxy() {
        TicketOffice ticketOffice = new OfflineTicketOffice();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(ticketOffice);
        TicketOffice ticketOfficeProxy = (TicketOffice) myInvocationHandler.getProxy();
        Assert.assertEquals("Buy insurance... jdkBuy a ticket offline.", ticketOfficeProxy.buyTicket());
    }
}
