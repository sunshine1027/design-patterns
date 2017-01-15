package com.sunshine1027.adapter;

import java.math.BigDecimal;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Foreign {
    private long id;
    private String name;
    private TitleType title;

    public Foreign(long id, String name, TitleType title) {
        this.id = id;
        this.name = name;
        this.title = title;
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

    public BigDecimal getS() {
        return BigDecimal.valueOf(id);
    }
}
