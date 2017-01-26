package com.sunshine1027.proxy;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class OfflineTicketOffice extends TicketOffice{
    @Override
    public void buyTicket() {
        System.out.println("Buy a ticket offline.");
    }
}
