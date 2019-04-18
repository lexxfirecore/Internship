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
        double[] number = new double[scan.nextInt()];
        System.out.println("Lungimea array-ului : " + number.length);
        System.out.print("Elementele array-ului : ");

        for (int i = 0; i < number.length; i++) {
            number[i] = getrandom(-3, 3);
            System.out.print(number[i] + " ");
        }

        System.out.println("\nSuma este = " + suma(number));

        System.out.println("Produsul este = " + produs(number));

        System.out.println("Media aritmetica este = " + mediaa(number));

        if (mediaa(number) == 0) {
            System.out.println("Din păcate, divizarea prin zero nu este permisă");
        } else {
            System.out.println("Rezultatul formulei (produs * suma / media) este = " + calcExpresie(number));
        }
    }

    private static int getrandom(int startarray, int endarray) {
        Random random = new Random();
        return startarray + random.nextInt(endarray - startarray + 1);
    }

    public static int suma(double[] number) {
        int suma = 0;
        for (int i = 0; i < number.length; i++) {
            suma += number[i];
        }
        return suma;
    }

    public static int produs(double[] number) {
        int produs = 1;
        for (int i = 0; i < number.length; i++) {
            produs *= number[i];
        }
        return produs;
    }

    public static double mediaa(double[] number) {
        double mediaa = 0;
        for (double i = 0; i < number.length; i++) {
            mediaa = suma(number) / number.length;
        }
        return mediaa;
    }

    public static double calcExpresie(double[] number) {
        int suma = suma(number);
        int produs = produs(number);
        double mediaa = mediaa(number);
        double rezultat = (produs(number) * suma(number)) / mediaa(number);
        return rezultat;
    }
}
