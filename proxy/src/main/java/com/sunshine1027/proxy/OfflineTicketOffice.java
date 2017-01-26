package com.sunshine1027.proxy;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class OfflineTicketOffice implements TicketOffice {
    @Override
    public String buyTicket() {
        return "Buy a ticket offline.";
    }
}
