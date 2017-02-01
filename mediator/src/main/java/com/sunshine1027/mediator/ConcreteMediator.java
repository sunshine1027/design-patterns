package com.sunshine1027.mediator;

import java.math.BigDecimal;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ConcreteMediator extends Mediator{
    private KFC kfc;
    private MacDonald macDonald;

    public ConcreteMediator() {
    }

    public ConcreteMediator(KFC kfc, MacDonald macDonald) {
        this.kfc = kfc;
        this.macDonald = macDonald;
    }

    @Override
    public void change(Food food) {
        if (food == kfc) {
            macDonald.setPrice(macDonald.getPrice().add(BigDecimal.ONE));
            System.out.println("kfc change the price, and now macDonald change the price.\n");
        }
        else if (food == macDonald) {
            kfc.setKfcPrice(kfc.getKfcPrice().add(BigDecimal.ONE));
            System.out.println("macDonald change the price, and now kfc change the price.\n");
        }
    }

    public KFC getKfc() {
        return kfc;
    }

    public void setKfc(KFC kfc) {
        this.kfc = kfc;
    }

    public MacDonald getMacDonald() {
        return macDonald;
    }

    public void setMacDonald(MacDonald macDonald) {
        this.macDonald = macDonald;
    }
}
