package com.sunshine1027.iterator;

import com.google.common.collect.Lists;
import java.util.List;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class FoodAggregate implements Aggregate{
    private List<Item> items;

    public FoodAggregate() {
        items = Lists.newArrayList();
    }

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public Item get(int index) {
        return items.get(index);
    }

    @Override
    public ItemIterator iterator() {
        return new FoodIterator(this);
    }

    @Override
    public int size() {
        return items.size();
    }

    public List<Item> getItems() {
        List<Item> list = Lists.newArrayList();
        return list.addAll(items) ? list : null;
    }
}
