package com.internship.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by vmarian on 14-Apr-19.
 */
public class VMarianArrays {
    public static void main(String[] args) {
        main();
    }

    public static void main() {
        System.out.println("introduceti dimensiunea vectorului:");
        Scanner scan = new Scanner(System.in);
        int[] vector = new int[scan.nextInt()];
        int vectorLength = vector.length;
        System.out.println("Lungimea array-ului : " + vectorLength);
        System.out.print("Elementele array-ului : ");

        printVector(vector);

        int suma = suma(vector);
        System.out.println("\nSuma este = " + suma);

        int produs = produs(vector);
        System.out.println("Produsul este = " + produs);

        double media = media(suma, vectorLength);
        System.out.println("Media aritmetica este = " + media);

        if (media != 0) {
            double expresie = calcExpresie(suma, produs, media);
            System.out.println("Rezultatul formulei (produs * suma / media) este = " + expresie);
        } else {
            System.out.println("Media este 0, expresia nu poate fi calculata.");
        }
    }

    private static void printVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generateRandom(-1, 1);
            System.out.print(vector[i] + " ");
        }
    }

    private static int generateRandom(int startarray, int endarray) {
        Random random = new Random();
        return startarray + random.nextInt(endarray - startarray + 1);
    }

    public static int suma(int[] vector) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma;
    }

    public static int produs(int[] vector) {
        int produs = 1;
        for (int i = 0; i < vector.length; i++) {
            produs *= vector[i];
        }
        return produs;
    }

    public static double media(int suma, int vectorLength) {
        return (double) suma / vectorLength;
    }

    public static double calcExpresie(int suma, int produs, double media) {
        return produs * suma / media;
    }
}
