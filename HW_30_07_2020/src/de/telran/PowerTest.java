package de.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerTest {

    Power numberPow = new Power();

    @Test
    public void testNumberPow() {
        assertEquals(64, numberPow.pow(8, 2));
    }

    @Test
    public void testNumberPow2_num8AndPower2_numInPower64() {
        assertEquals(64, numberPow.pow(8, 2));
    }

    @Test
    public void testNumberPow2_num3AndPower3_numInPower27() {
        assertEquals(27, numberPow.pow(3, 3));
    }

    @Test
    public void testNumberPow2_num2AndPower10_numInPower1024() {
        assertEquals(1024, numberPow.pow(2, 10));
    }


}

