package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

import static org.junit.Assert.*;

public class TestHouseCat {
    @Test
    public void inheritsSuperInFirstConstructor(){
        HouseCat keyboardCat = new HouseCat("Keyboard Cat",7);
        assertEquals(7,keyboardCat.getWeight(),.001);
    }
    @Test
    public void inheritsSuperInSecondConstructor(){
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertEquals(0,keyboardCat.getWeight(),.001);
    }
    @Test
    public void inheritsEat(){
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        //cat is not tired
        assertFalse(keyboardCat.isTired());
        //cat is not hungry
        assertFalse(keyboardCat.isHungry());
        //feed cat - if cat eats when not hungry, cat will get tired
        keyboardCat.eat();
        assertTrue(keyboardCat.isTired());
    }
}
