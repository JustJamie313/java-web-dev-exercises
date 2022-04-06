package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {
    Car testCar;
    @Before
    public void createCarObject(){
        testCar = new Car("Toyota", "Sionna", 16, 24);
    }
    
    @Test
    public void testInitialGasTank(){
        assertEquals(16,testCar.getGasTankLevel(),.001);
        assertFalse(testCar.getGasTankLevel() == 0);
        assertTrue(testCar.getGasTankLevel() == 16);
    }
    @Test
    public void testGasTankAfterDriving(){
        testCar.drive(48);
        assertEquals(14,testCar.getGasTankLevel(),.001);
    }
    @Test
    public void testGasTankAfterExceedingMaximumRange(){
        testCar.drive(385);
        assertEquals(0,testCar.getGasTankLevel(),.001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        testCar.addGas(17);
        fail("Cannot add more than 16 gallons of fuel");
    }

}
