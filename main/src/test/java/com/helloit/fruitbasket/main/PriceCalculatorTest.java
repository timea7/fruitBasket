package com.helloit.fruitbasket.main;

import org.junit.Assert;
import org.junit.Test;

/**
 */
public class PriceCalculatorTest {
    @Test
    public void checkTotalPrice() {
        final PriceCalculator calculator = new PriceCalculator();
        final Basket basket = new Basket();
        basket.addFruit(new Fruit("apple", 3.14));
        basket.addFruit(new Fruit("banana", 5.26));
        double price = calculator.calculateTotalPrice(basket);


        Assert.assertEquals("Checking price!", 8.4, price, .0);
    }
}
