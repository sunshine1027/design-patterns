package com.sunshine1027.composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public abstract class PointComposite {

    private List<PointComposite> list = Lists.newArrayList();


    public void add(PointComposite pointComposite) {
       list.add(pointComposite);
    }

    public void remove(PointComposite pointComposite) {
        list.remove(pointComposite);
    }

    @Override
    public String toString() {
        return "PointComposite{" +
                "list=" + list +
                '}';
    }
}
