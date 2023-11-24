package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask2Test {

    @Test
    void test1() {
        ArrayTask2 searchInsertPosition = new ArrayTask2();
        int[] inputArray = {0, 1, 2, 3, 5};
        int result = searchInsertPosition.searchInsert(inputArray, 5);
        assertEquals(4, result);
    }
}