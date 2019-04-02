package com.internship;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by lexx on 02-Apr-19.
 */
public class InternshipUtils {
    private static final String[] INTERNS = new String[]{"Vasea", "Margarita", "Ion", "Mario"};

    public static void variantele(int day) {
        switch (day) {
            case 3:
                Collections.sort(Arrays.asList(INTERNS));
            case 1:
            case 2:
                printInters();
                break;
            default:
                System.err.println("Variant not implemented.");
        }
    }

    private static void printInters() {
        for (int i = 0; i < INTERNS.length; i++) {
            System.out.println("Varianta" + (i + 1) + ": " + INTERNS[i]);
        }

    }
}
