package com.sunshine1027.test.iterator;

import com.sunshine1027.iterator.Aggregate;
import com.sunshine1027.iterator.FoodAggregate;
import com.sunshine1027.iterator.Item;
import com.sunshine1027.iterator.ItemIterator;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class IteratorTest {
    @Test
    public void test() {
        Aggregate aggregate = new FoodAggregate();
        aggregate.add(new Item("apple", BigDecimal.valueOf(1.2)));
        aggregate.add(new Item("banana", BigDecimal.valueOf(1.3)));
        aggregate.add(new Item("tomato", BigDecimal.valueOf(1.4)));
        ItemIterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
