package by.itstep.java1022.belser.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class VectorMirrorImageTest {

    @Test
    public void vectorMirrorImage(){

        String expected = "Vector is not mirrored";
        double[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String actual = VectorSort.sort(vector);

        assertEquals(expected, actual);
        assertEquals("Vector is mirrored", VectorSort.sort(new double[]{1, 3, 4, 4, 4, 3, 1}));
        assertEquals("Vector is mirrored", VectorSort.sort(new double[]{1, 2, 3, 4, 3, 2, 1}));
        assertEquals("Vector is not mirrored", VectorSort.sort(new double[]{9, 4, 5, 6, 6, 8, 6}));
        assertEquals("Vector is mirrored", VectorSort.sort(new double[]{-2, -5, -4, 3, -4, -5, -2}));
        assertEquals("Vector is mirrored", VectorSort.sort(new double[]{11, 32, 44, 44, 32, 11}));
        assertEquals("Vector is mirrored", VectorSort.sort(new double[]{-1, 3, 2, 33, 2, 3, -1}));
        assertEquals("Vector is not mirrored", VectorSort.sort(new double[]{1, 3, 5, 10, 60, 81, 82}));
        assertEquals("Vector is not mirrored", VectorSort.sort(new double[]{12, 13, 15, 33, 62, 81, 67}));
        assertEquals("Vector is not mirrored", VectorSort.sort(new double[]{15, 32, 41, -3, -6, -8, -6}));
        assertEquals("Vector is not mirrored", VectorSort.sort(new double[]{3, 2, 1, -3, -6, -8, -6}));
        assertEquals("Vector is mirrored", VectorSort.sort(new double[]{-9, -8, -7, -6, -7, -8, -9}));
        assertEquals("Vector is mirrored", VectorSort.sort(new double[]{-9, -85, -7, -6, -7, -85, -9}));
        assertEquals("Vector is mirrored", VectorSort.sort(new double[]{-1, -2, -5, -5, -5, -2, -1}));

    }
}
