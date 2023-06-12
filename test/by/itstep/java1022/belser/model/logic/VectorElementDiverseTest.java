package by.itstep.java1022.belser.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorElementDiverseTest {
    @Test
    public void vectorElementDiverse() {

        String expected = "Elements is diverse";
        int[] vector = {2, 2, 2, 2, 2, 2, 2, 2};
        String actual = VectorElementDiverse.elementDiverse(vector);

        assertEquals(expected, actual);
        assertEquals("Elements is diverse", VectorElementDiverse.elementDiverse(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("Elements is not diverse", VectorElementDiverse.elementDiverse(new int[]{1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("Elements is not diverse", VectorElementDiverse.elementDiverse(new int[]{1, 1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("Elements is not diverse", VectorElementDiverse.elementDiverse(new int[]{1, 1, 1, 1, 1, 1, 1, -1, 1, 1, 1, 1}));
        assertEquals("Elements is not diverse", VectorElementDiverse.elementDiverse(new int[]{1, 1, 1, 1, 11, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("Elements is not diverse", VectorElementDiverse.elementDiverse(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 21, 1, 1, 1}));
        assertEquals("Elements is not diverse", VectorElementDiverse.elementDiverse(new int[]{1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("Elements is diverse", VectorElementDiverse.elementDiverse(new int[]{7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7}));
        assertEquals("Elements is diverse", VectorElementDiverse.elementDiverse(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("Elements is not diverse", VectorElementDiverse.elementDiverse(new int[]{1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1}));
        assertEquals("Elements is not diverse", VectorElementDiverse.elementDiverse(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1}));
        assertEquals("Elements is not diverse", VectorElementDiverse.elementDiverse(new int[]{1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("invalid data", VectorElementDiverse.elementDiverse(new int[]{1}));
        assertEquals("invalid data", VectorElementDiverse.elementDiverse(new int[]{}));

    }
}
