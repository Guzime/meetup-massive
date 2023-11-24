package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask5Test {

    @Test
    void test5() {
        ArrayTask5 searchInsertPosition = new ArrayTask5();
        int[] a = {1, 2, 3};
        int[] b = {3, 1, 2};
        assertTrue(searchInsertPosition.isAnnagram(a, b));
    }

    @Test
    void test6() {
        ArrayTask5 searchInsertPosition = new ArrayTask5();
        int[] a = {1, 3, 3, 4};
        int[] b = {4, 3, 1, 3};
        assertTrue(searchInsertPosition.isAnnagram(a, b));
    }

    @Test
    void test7() {
        ArrayTask5 searchInsertPosition = new ArrayTask5();
        int[] a = {1, 3, 3};
        int[] b = {0, 3, 1};
        assertFalse(searchInsertPosition.isAnnagram(a, b));
    }

}