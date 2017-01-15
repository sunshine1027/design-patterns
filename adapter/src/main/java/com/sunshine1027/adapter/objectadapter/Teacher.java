package com.sunshine1027.adapter.objectadapter;

import java.math.BigDecimal;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Teacher extends Employee{

    public Teacher(long id, String name, TitleType title, int age) {
        super(id, name, title, age);
    }

    @Override
    public BigDecimal getSalary() {
        int base = 1;
        switch (getTitle()) {
            case PROFESSOR:
                base = 10;
                break;
            case ADJUNCT_PROFESSOR:
                base = 8;
                break;
            case LECTURER:
                base = 6;
                break;
            default:
                base = 0;
                break;
        }
        return new BigDecimal(this.getAge() * base);
    }
}
