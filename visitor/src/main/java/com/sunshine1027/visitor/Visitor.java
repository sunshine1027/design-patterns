package com.sunshine1027.visitor;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public abstract class Visitor {
    public abstract void visitManager(Manager element);
    public abstract void visitGeneralStaff(GeneralStaff element);
}
