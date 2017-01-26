package com.sunshine1027.proxy.normal;

import com.sunshine1027.proxy.TicketOffice;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Proxy implements TicketOffice {
    private TicketOffice ticketOffice;

    public Proxy(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    @Override
    public String buyTicket() {
        return buyInsurance() + ticketOffice.buyTicket();
    }

    private String buyInsurance() {
        return "Buy insurance...";
    }
}
