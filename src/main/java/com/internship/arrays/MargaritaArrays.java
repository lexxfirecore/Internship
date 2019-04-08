package com.internship.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by margarita on 02-Apr-19.
 */
public class MargaritaArrays {
    public static int getMin(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {

            if (min < a[i]) {
            } else {
                min = a[i];
            }
        }

        return min;
    }

    public static int getMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {

            if (max > a[i]) {
            } else {
                max = a[i];
            }
        }

        return max;

    }

    public static int calcExpresie(int[] a) {
        int min = getMin(a);
        int max = getMax(a);
        int nrElementelor = a.length;
        int rez = (min * max) / nrElementelor;
        return rez;
    }

    public static void main(String[] args) {

        main();


    }

    public static void main() {
        System.out.print("introduceti dimensiunea vectorului:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] vector = new int[number];
        System.out.println("Dimensiunea vectorului este: " + number);

        Random random = new Random();
        int maxRand = 20;
        int minRand = -10;
        System.out.print("Elementele vectorului: ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(maxRand + 1 - minRand) + minRand;
            System.out.print(vector[i] + " ");
        }

        System.out.println("\nmin =" + getMin(vector) + " max = " + getMax(vector));

        System.out.print("rezultatul expresiei min * max / nr_elem: ");
        System.out.println(calcExpresie(vector));
    }
}
