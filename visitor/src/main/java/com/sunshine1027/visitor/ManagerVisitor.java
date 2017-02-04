package com.sunshine1027.visitor;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ManagerVisitor extends Visitor{
    @Override
    public void visitManager(Manager element) {
        System.out.println("manager visitor visit manager," + element.toString());
    }

    @Override
    public void visitGeneralStaff(GeneralStaff element) {
        //do nothing here
    }
}
