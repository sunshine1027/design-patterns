package com.sunshine1027.visitor;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class GeneralStaffVisitor extends Visitor{
    @Override
    public void visitManager(Manager element) {
        //do nothing here
    }

    @Override
    public void visitGeneralStaff(GeneralStaff element) {
        System.out.println("general staff visitor visit general staff," + element.toString());
    }
}
