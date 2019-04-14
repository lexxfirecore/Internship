package com.internship.arrays;

import java.util.Random;
import java.util.Scanner;
/*
Created by VMarian    14.04.2019
 */
public class VMarianArrays {

    public static void main(String[] args) {
        main();
    }

    public static void main() {
        System.out.println("introduceti dimensiunea vectorului:");
        Scanner scan = new Scanner(System.in);
        int[] number = new int[scan.nextInt()];
        System.out.println("Lungimea array-ului : " + number.length);
        System.out.print("Elementele array-ului : ");

        for (int i = 0; i < number.length; i++) {
            number[i] = getrandom(-100, 100);
            System.out.print(number[i] + " ");
        }

        System.out.println("\nSuma este = " + suma(number));

        System.out.println("Produsul este = " + produs(number));

        System.out.println("Media aritmetica este = " + mediaa(number));

        System.out.println("Rezultatul formulei (produs * suma / media) este = " + calcExpresie(number));
    }

    private static int getrandom(int startarray, int endarray) {
        Random random = new Random();
        return startarray + random.nextInt(endarray - startarray + 1);
    }

    public static int suma(int[] number) {
        int suma = 0;
        for (int i = 0; i < number.length; i++) {
            suma += number[i];
        }
        return suma;
    }

    public static int produs(int[] number) {
        int produs = 1;
        for (int i = 0; i < number.length; i++) {
            produs *= number[i];
        }
        return produs;
    }

    public static int mediaa(int[] number) {
        int mediaa = 0;
        for (int i = 0; i < number.length; i++) {
            mediaa = suma(number) / number.length;
        }
        return mediaa;
    }

    public static int calcExpresie(int[] number) {
        int suma = suma(number);
        int produs = produs(number);
        int mediaa = mediaa(number);
        int rezultat = (produs(number) * suma(number)) / mediaa(number);
        return rezultat;
    }
}