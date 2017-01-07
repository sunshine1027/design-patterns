package com.sunshine1027.test.builder;

import com.sunshine1027.builder.FactoryEnum;
import com.sunshine1027.builder.Product;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class BuilderTest {

    @Test
    public void testProduct() {
        Calendar calendar = Calendar.getInstance();
        Date create = calendar.getTime();
        calendar.add(Calendar.DATE, 1);
        Date expiry = calendar.getTime();
        Product.ProductBuilder builder = new Product.ProductBuilder();
        builder.addProductId("id").addProductName("name").addCreationDate(create).addExpiryDate(expiry).addFactory(FactoryEnum.EBAY);
        Product product = builder.build();
        System.out.println(product.toString());
    }
}
