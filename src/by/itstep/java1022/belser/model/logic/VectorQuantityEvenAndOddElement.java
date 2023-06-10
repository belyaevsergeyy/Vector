package by.itstep.java1022.belser.model.logic;

public class VectorQuantityEvenAndOddElement {
    public static String quantityEvenAndOddElement(int[] vector) {
        int even = 0;
        int odd = 0;
        String msg = "Quantity even = " + even + ", Quantity odd = " + odd;
        for (int j : vector) {
            if (j % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return msg;
    }
}
