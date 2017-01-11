package com.sunshine1027.prototype;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Factory implements Cloneable{
    private String factoryName;

    public Factory(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
