package com.helloit.fruitbasket.main;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Student on 6/2/2016.
 */
public class FruitTest {

    @Test
    public void checkFruit(){
        final Fruit apple  = new Fruit("apple", 1.5);
       Assert.assertEquals("Checking fruit name!", "apple", apple.getName());
        apple.setName("banana");
        apple.setPrice(3.14);

        Assert.assertEquals("Checking fruit name!", "banana", apple.getName());
        Assert.assertEquals("Checking fruit price!", 3.14, apple.getPrice(), .0);

    }
}
