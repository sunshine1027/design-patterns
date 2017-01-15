package com.sunshine1027.adapter;

import java.math.BigDecimal;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Employee {
    private long id;
    private String name;
    private TitleType title;
    private int age;

    public Employee(long id, String name, TitleType title, int age) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TitleType getTitle() {
        return title;
    }

    public void setTitle(TitleType title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return BigDecimal.ZERO;
    }
}
