package com.telran;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoinsTest {

        Coins coins = new Coins();

        @Test
        public void testGetMinNumbersOfCoins_sum0_coins0() {
            assertEquals(0, coins.makeChange(0));
        }

        @Test
        public void testGetMinNumbersOfCoins_sum1_coins1() {
            assertEquals(1, coins.makeChange(1));
        }

        @Test
        public void testGetMinNumbersOfCoins_sum2_coins2() {
            assertEquals(2, coins.makeChange(2));
        }

        @Test
        public void testGetMinNumbersOfCoins_sum3_coins3() {
            assertEquals(3, coins.makeChange(3));
        }

        @Test
        public void testGetMinNumbersOfCoins_sum4_coins4() {
            assertEquals(4, coins.makeChange(4));
        }

        @Test
        public void testGetMinNumbersOfCoins_sum5_coins1() {
            assertEquals(1, coins.makeChange(5));
        }

        @Test
        public void testGetMinNumbersOfCoins_sum7_coins3() {
            assertEquals(3, coins.makeChange(7));
        }

        @Test
        public void testGetMinNumbersOfCoins_sum10_coins1() {
            assertEquals(1, coins.makeChange(10));
        }

}


