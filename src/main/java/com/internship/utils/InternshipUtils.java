package com.internship.utils;

/**
 * Created by lexx on 02-Apr-19.
 */
public class InternshipUtils {

    private static final String[] INTERNS = new String[]{"Vasea", "Margarita", "Ion"};

    public static void main(String[] args) {
        printInterns();
    }

    private static void printInterns() {
        for (int i = 0; i < INTERNS.length; i++) {
            System.out.println("Varianta" + (i + 1) + ": " + INTERNS[i]);
        }
    }
}
