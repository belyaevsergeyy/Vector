package by.itstep.java1022.belser.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorSortTest {
    @Test
    public void testSort() {

        String expected = "Vector is sorted";
        double[] vector = {1.4, 2, 3, 4.3, 5, 6, 7, 8.6, 9};
        String actual = VectorSort.sort(vector);

        assertEquals(expected, actual);
        assertEquals("Vector is not sorted", VectorSort.sort(new double[]{1.5, 3, 4.3, 3, 6, 8.8, 6,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new double[]{1, 3.5, 4.2, 3, 6, 8.5, 6,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new double[]{9, 4, 5, 6, 6, 8, 6,}));
        assertEquals("Vector is sorted", VectorSort.sort(new double[]{6, 5.5, 4, 3.3, 2, 1, -2.7,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new double[]{11.34, 32.3, 44, 35.4, 63, 82, 61,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new double[]{-1.5, 3, 2.5, 33, -2, -3.5, -4,}));
        assertEquals("Vector is sorted", VectorSort.sort(new double[]{1.2, 3.5, 5, 10, 60.7, 81, 82,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new double[]{12.5, 13.6, 15, 33.6, 62, 81, 67,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new double[]{15.3, 32, 41.5, -3, -6.4, -8, -6,}));
        assertEquals("Vector is not sorted", VectorSort.sort(new double[]{3.44, 2, 1, 4, -3, -6.4, -8, -6,}));
        assertEquals("Vector is sorted", VectorSort.sort(new double[]{-9, -8.4, -7, -6.6, -5, -4.3, -3,}));
        assertEquals("Vector is sorted", VectorSort.sort(new double[]{-9, -8, -7.2, -6.45, -5, -4.45, -4,}));
        assertEquals("Vector is sorted", VectorSort.sort(new double[]{-1, -2.3, -5.1, -5.4, -5.8, -6.4, -7,}));


    }
}
