package com.sunshine1027.mediator;

import java.math.BigDecimal;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class MacDonald extends Food{

    private BigDecimal price;

    public MacDonald(BigDecimal price) {
        this.price = price;
    }

    public MacDonald(Mediator mediator, BigDecimal price) {
        super(mediator);
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public void changePrice() {
        BigDecimal originPrice = price;
        setPrice(price.add(BigDecimal.ONE));
        System.out.println(String.format("MacDonald change price,origin price is %s, now is %s.", originPrice, price));
        //notice mediator to change MacDonald
        getMediator().change(this);
    }
}
