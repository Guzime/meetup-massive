package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask4Test {

    @Test
    void test2() {
        ArrayTask4 searchInsertPosition = new ArrayTask4();
        int[] inputArray = {0, 1, 2, 3, 5};
        assertFalse(searchInsertPosition.isPalindrome(inputArray));
    }

    @Test
    void test3() {
        ArrayTask4 searchInsertPosition = new ArrayTask4();
        int[] inputArray = {0, 1, 2, 1, 0};
        assertTrue(searchInsertPosition.isPalindrome(inputArray));
    }

    @Test
    void test4() {
        ArrayTask4 searchInsertPosition = new ArrayTask4();
        int[] inputArray = {1, 1, 1, 1};
        assertTrue(searchInsertPosition.isPalindrome(inputArray));
    }

}