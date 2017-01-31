package com.sunshine1027.iterator;

import java.util.Collections;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class FoodIterator implements ItemIterator{
    private FoodAggregate aggregate;
    private int size;
    private int index;

    private FoodIterator() {
    }

    public FoodIterator(FoodAggregate aggregate) {
        this.aggregate = aggregate;
        this.size = aggregate.size();
        this.index = -1;
    }


    @Override
    public boolean hasNext() {
        return index < size - 1;
    }

    @Override
    public Item next() {
        //at the end of the list,return null
        if (!hasNext())
            return null;
        return aggregate.get(++index);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
