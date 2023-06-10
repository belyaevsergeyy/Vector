package by.itstep.java1022.belser.model.logic;

public class VectorElementDiverse {
    public static String elementDiverse(int[] vector) {

        String msg = "Elements is diverse";
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] != vector[i + 1]) {
                msg = "Elements is not diverse";
                break;
            }
        }
        return msg;
    }
}
