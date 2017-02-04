package com.sunshine1027.visitor;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class EmployeeStructure {
    private List<Employee> employees;

    public EmployeeStructure() {
        employees = Lists.newArrayList();
    }
    public EmployeeStructure(List<Employee> employees) {
        this.employees = employees;
    }

    public void addElement(Employee employee) {
        employees.add(employee);
    }

    public void accept(Visitor visitor) {
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
