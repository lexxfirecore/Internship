package com.internship;

import com.internship.arrays.IonArrays;
import com.internship.arrays.MargaritaArrays;
import com.internship.arrays.VMarianArrays;

/**
 * Created by lexx on 02-Apr-19.
 */
public class ArraysCalculations {
    public static void main(String[] args) {
        System.out.println(ArraysCalculations.class.getName() + ": ");

        arr_varianta_1();
        arr_varianta_2();
        arr_varianta_3();
        arr_varianta_4();

    }

    private static void arr_varianta_1() {
        System.out.println("Varianta 1: VMarian.");
        VMarianArrays.main();
    }

    private static void arr_varianta_2() {
        System.out.println("Varianta 2: Margarita.");

        MargaritaArrays.main();

    }

    private static void arr_varianta_3() {
        System.out.println("Varianta 3: Ion.");

       IonArrays.main();
    }

    private static void arr_varianta_4() {
    }

}
