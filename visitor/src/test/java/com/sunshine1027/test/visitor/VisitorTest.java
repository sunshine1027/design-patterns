package com.sunshine1027.test.visitor;

import com.sunshine1027.visitor.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class VisitorTest {
    private EmployeeStructure employeeStructure;

    @Before
    public void init() {
        employeeStructure = new EmployeeStructure();
        employeeStructure.addElement(new Manager(10001, "manager1"));
        employeeStructure.addElement(new Manager(10002, "manager2"));
        employeeStructure.addElement(new Manager(10003, "manager3"));

        employeeStructure.addElement(new GeneralStaff(20001, "generalStaff1"));
        employeeStructure.addElement(new GeneralStaff(20002, "generalStaff2"));
    }
    @Test
    public void managerTest() {
        Visitor managerVisitor = new ManagerVisitor();
        employeeStructure.accept(managerVisitor);
    }

    @Test
    public void generalStaffTest() {
        Visitor generalStaffVisitor = new GeneralStaffVisitor();
        employeeStructure.accept(generalStaffVisitor);
    }
}
