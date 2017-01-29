package com.sunshine1027.chainofresponsity;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public abstract class ManagerHandler {
    private ManagerHandler nextHandler;

    public ManagerHandler() {
    }

    public ManagerHandler(ManagerHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract String requestForRest(RestMsg restMsg);

    public abstract boolean checkHandlerAvailable(RestMsg restMsg);

    public ManagerHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(ManagerHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
