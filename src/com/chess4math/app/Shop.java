package com.chess4math.app;

import com.chess4math.data.Product;

import java.math.BigDecimal;

/**
 * {@code Shop} class represents an application that manages Products
 * @version 4.0
 * @author lorenchess
 */

public class Shop {

    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setId(101);
        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));
    }
}
