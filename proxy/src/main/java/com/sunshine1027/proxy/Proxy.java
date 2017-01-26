package com.sunshine1027.proxy;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Proxy extends TicketOffice{
    private TicketOffice ticketOffice;

    public Proxy(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    @Override
    public void buyTicket() {
        buyInsurance();
        ticketOffice.buyTicket();
    }

    private void buyInsurance() {
        System.out.println("Buy insurance...");
    }
}
