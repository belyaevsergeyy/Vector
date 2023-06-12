package by.itstep.java1022.belser.model.controller;

import by.itstep.java1022.belser.model.logic.VectorElementDiverse;
import by.itstep.java1022.belser.model.logic.VectorMirrorImage;
import by.itstep.java1022.belser.model.logic.VectorQuantityEvenAndOddElement;
import by.itstep.java1022.belser.model.logic.VectorSort;

public class Main {
    public static void main(String[] args) {
        double[] vector = {2, 3.45, 2.34, 4, 5, 6};
        System.out.println(VectorSort.sort(vector));
        int[] vector1 = {3, 4, 5, 6, 7, 8, 9};
        System.out.println(VectorMirrorImage.mirrorImage(vector1));
        System.out.println(VectorElementDiverse.elementDiverse(vector1));
        System.out.println(VectorQuantityEvenAndOddElement.quantity(vector1));

    }
}