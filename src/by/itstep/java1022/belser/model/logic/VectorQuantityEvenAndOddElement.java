package by.itstep.java1022.belser.model.logic;

public class VectorQuantityEvenAndOddElement {
    public static String quantity(int[] vector) {
        if (vector.length < 1){
            return "invalid data";
        }
        int even = 0;
        int odd = 0;
        for (int j : vector) {
            if (j % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return "Quantity even = " + even + ", Quantity odd = " + odd;
    }
}
