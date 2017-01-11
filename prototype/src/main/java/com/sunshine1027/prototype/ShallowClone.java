package com.sunshine1027.prototype;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ShallowClone implements Cloneable{
    private String typeName;
    private Factory factory;


    public ShallowClone(String typeName, Factory factory) {
        this.typeName = typeName;
        this.factory = factory;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
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
