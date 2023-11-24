package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask3Test {

    @Test
    public void test1() {
        ArrayTask3 arrayTask3 = new ArrayTask3();
        int[] inputArray = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        arrayTask3.moveZeroes(inputArray);
        assertArrayEquals(expected, inputArray);
    }

    @Test
    public void test2() {
        ArrayTask3 arrayTask3 = new ArrayTask3();
        int[] inputArray = {0, 0, 1};
        int[] expected = {1, 0, 0};
        arrayTask3.moveZeroes(inputArray);
        assertArrayEquals(expected, inputArray);
    }

    @Test
    public void test3() {
        ArrayTask3 arrayTask3 = new ArrayTask3();
        int[] inputArray = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        arrayTask3.moveZeroes(inputArray);
        assertArrayEquals(expected, inputArray);
    }

    @Test
    public void test4() {
        ArrayTask3 arrayTask3 = new ArrayTask3();
        int[] inputArray = {0, 0, 1};
        int[] expected = {1, 0, 0};
        arrayTask3.moveZeroes(inputArray);
        assertArrayEquals(expected, inputArray);
    }

}