package com.sunshine1027.iterator;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public interface Aggregate {
    void add(Item item);
    Item get(int index);
    ItemIterator iterator();
    int size();

}
