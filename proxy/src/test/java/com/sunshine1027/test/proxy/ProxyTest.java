package com.sunshine1027.test.proxy;

import com.sunshine1027.proxy.OfflineTicketOffice;
import com.sunshine1027.proxy.Proxy;
import com.sunshine1027.proxy.TicketOffice;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ProxyTest {
    @Test
    public void test() {
        TicketOffice ticketOffice = new OfflineTicketOffice();
        Proxy proxy = new Proxy(ticketOffice);
        proxy.buyTicket();
    }
}
