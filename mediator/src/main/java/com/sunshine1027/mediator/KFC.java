package com.sunshine1027.mediator;

import java.math.BigDecimal;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class KFC extends Food{
    private BigDecimal kfcPrice;

    public KFC(BigDecimal kfcPrice) {
        this.kfcPrice = kfcPrice;
    }

    public KFC(Mediator mediator, BigDecimal kfcPrice) {
        super(mediator);
        this.kfcPrice = kfcPrice;
    }

    public BigDecimal getKfcPrice() {
        return kfcPrice;
    }

    public void setKfcPrice(BigDecimal kfcPrice) {
        this.kfcPrice = kfcPrice;
    }

    @Override
    public void changePrice() {
        BigDecimal originPrice = kfcPrice;
        setKfcPrice(kfcPrice.add(BigDecimal.ONE));
        System.out.println(String.format("KFC change price,origin price is %s, now is %s.", originPrice, kfcPrice));
        //notice mediator to change MacDonald
        getMediator().change(this);
    }
}
