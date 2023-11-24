package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask1Test {

    @Test
    public void test() {
        ArrayTask1 arrayTask1 = new ArrayTask1();
        int[] inputArray = {1, 2, 3, 1};
        int[] expected = {1, 2, 3, 2};
        int[] result = arrayTask1.plusOne(inputArray);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        ArrayTask1 arrayTask1 = new ArrayTask1();
        int[] inputArray = {1, 2, 9, 9};
        int[] expected = {1, 3, 0, 0};
        int[] result = arrayTask1.plusOne(inputArray);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        ArrayTask1 arrayTask1 = new ArrayTask1();
        int[] inputArray = {9, 9, 9, 9};
        int[] expected = {1, 0, 0, 0, 0};
        int[] result = arrayTask1.plusOne(inputArray);
        assertArrayEquals(expected, result);
    }

}