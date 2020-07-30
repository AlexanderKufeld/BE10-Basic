package com.telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SortedListTest {


    SortedList mult = new SortedList();

    @Test
    public void testSortedList_nIs33_true() {
        List<Integer> toTest = Arrays.asList(1, 3, 8, 9, 9, 11, 20);
        assertTrue(mult.isDevided(toTest, 33));
    }

    @Test
    public void testSortedList_nIs64_false() {
        List<Integer> toTest = Arrays.asList(1, 3, 8, 9, 9, 11, 20);
        assertFalse(mult.isDevided(toTest, 64));
    }

    @Test
    public void testSortedList_nIs81_true() {
        List<Integer> toTest = Arrays.asList(1, 3, 8, 9, 9, 11, 20);
        assertTrue(mult.isDevided(toTest, 81));
    }

}

