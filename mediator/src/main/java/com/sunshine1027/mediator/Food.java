package com.sunshine1027.mediator;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public abstract class Food {
    private Mediator mediator;

    public Food() {
    }

    public Food(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void changePrice();

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
