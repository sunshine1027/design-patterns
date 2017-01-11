package com.sunshine1027.prototype;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class DeepClone implements Cloneable {
    private String typeName;
    private Factory factory;

    public DeepClone() {
    }

    public DeepClone(String typeName, Factory factory) {
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
        DeepClone deepClone = new DeepClone();
        deepClone.setTypeName(this.typeName);
        deepClone.setFactory((Factory) this.factory.clone());
        return deepClone;
    }
}
