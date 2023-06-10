package by.itstep.java1022.belser.model.logic;

public class VectorMirrorImage {
    public static String mirrorImage(int[] vector){
        int x = vector.length / 2;
        int middle = vector[x];
        int middleMirror = vector[x - 1];
        String msg = "Vector is mirrored";
        for (int i = 0; i < x; i++) {
            if (middle != middleMirror){
                msg = "Vector is not mirrored";
                break;
            }
            middle = vector[x + i];
            middleMirror = vector[x - i - 1];

        }

        return msg;
    }
}
