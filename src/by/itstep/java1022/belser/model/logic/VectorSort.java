package by.itstep.java1022.belser.model.logic;

public class VectorSort {
    public static String sort(double[] vector) {
        String msg = "Vector is sorted";
        if (vector.length <= 2) {
            return vector.length > 0 ? "Vector is sorted" : "invalid data";
        }
        for (int i = 1; i < vector.length - 1; i++) {
            if ((vector[i - 1] < vector[i] && vector[i] > vector[i + 1]) ||
                    (vector[i - 1] > vector[i] && vector[i] < vector[i + 1])) {
                msg = "Vector is not sorted";
                break;
            }
        }
        return msg;
    }
}
