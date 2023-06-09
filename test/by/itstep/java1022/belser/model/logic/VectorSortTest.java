package by.itstep.java1022.belser.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorSortTest {
    @Test
    public void testSort() {

        String expected = "Vector is sorted";
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String actual = VectorSort.sort(vector);

        assertEquals(expected, actual);
        assertEquals("Vector is not sorted", VectorSort.sort(new int[]{1, 3, 4, 3, 6, 8, 6,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new int[]{1, 3, 4, 3, 6, 8, 6,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new int[]{9, 4, 5, 6, 6, 8, 6,}));
        assertEquals("Vector is sorted", VectorSort.sort(new int[]{6, 5, 4, 3, 2, 1, -2,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new int[]{11, 32, 44, 35, 63, 82, 61,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new int[]{-1, 3, 2, 33, -2, -3, -4,}));
        assertEquals("Vector is sorted", VectorSort.sort(new int[]{1, 3, 5, 10, 60, 81, 82,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new int[]{12, 13, 15, 33, 62, 81, 67,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new int[]{15, 32, 41, -3, -6, -8, -6,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new int[]{3, 2, 1, -3, -6, -8, -6,}));
        assertEquals("Vector is sorted", VectorSort.sort(new int[]{-9, -8, -7, -6, -5, -4, -3,}));
        assertEquals("Vector is sorted", VectorSort.sort(new int[]{-9, -8, -7, -6, -5, -4, -4,}));
        assertEquals("Vector is sorted", VectorSort.sort(new int[]{-1, -2, -5, -5, -5, -6, -7,}));


    }
}
