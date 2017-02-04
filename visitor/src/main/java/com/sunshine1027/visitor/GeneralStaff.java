package com.sunshine1027.visitor;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class GeneralStaff extends Employee{
    public GeneralStaff(long id, String name) {
        super(id, name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGeneralStaff(this);
    }
}
