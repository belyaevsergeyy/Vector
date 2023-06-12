package by.itstep.java1022.belser.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorQuantityEvenAndOddElementTest {

    @Test
    public void vectorQuantityEvenAndOddElement() {

        String expected = "Quantity even = " + 4 + ", Quantity odd = " + 3;
        int[] vector = {2, 1, 2, 1, 2, 1, 2};
        String actual = VectorQuantityEvenAndOddElement.quantity(vector);

        assertEquals(expected, actual);
        assertEquals("invalid data",
                VectorQuantityEvenAndOddElement.quantity(new int[0]));
        assertEquals("Quantity even = " + 3 + ", Quantity odd = " + 4,
                VectorQuantityEvenAndOddElement.quantity(new int[]{1, 3, 4, 6, 1, 2, 7}));
        assertEquals("Quantity even = " + 2 + ", Quantity odd = " + 5,
                VectorQuantityEvenAndOddElement.quantity(new int[]{3, 3, 4, 12, 1, 3, 7}));
        assertEquals("Quantity even = " + 0 + ", Quantity odd = " + 7,
                VectorQuantityEvenAndOddElement.quantity(new int[]{1, 3, 5, 7, 1, 11, 7}));
        assertEquals("Quantity even = " + 7 + ", Quantity odd = " + 0,
                VectorQuantityEvenAndOddElement.quantity(new int[]{2, 4, 4, 6, 12, 2, 24}));
        assertEquals("Quantity even = " + 3 + ", Quantity odd = " + 4,
                VectorQuantityEvenAndOddElement.quantity(new int[]{-1, -3, -4, -6, -1, 2, 7}));
        assertEquals("Quantity even = " + 0 + ", Quantity odd = " + 1,
                VectorQuantityEvenAndOddElement.quantity(new int[]{1}));
    }

}
