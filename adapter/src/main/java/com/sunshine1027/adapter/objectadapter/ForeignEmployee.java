package com.sunshine1027.adapter.objectadapter;

import java.math.BigDecimal;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ForeignEmployee extends Employee{

    public ForeignEmployee(long id, String name, TitleType title, int age) {
        super(id, name, title, age);
    }

    private Foreign foreign = new Foreign(getId(), getName(), getTitle());
    @Override
    public BigDecimal getSalary() {
        return foreign.getS().multiply(BigDecimal.valueOf(getAge()));
    }
}
