package com.internship;

import java.lang.*;
import java.util.Scanner;

/**
 * Created by lexx on 01-Apr-19.
 * <p>
 * Fiecare scriti in metoda lui ca comentarii si explicati cum intelegeti fiecare,
 * ce inseamna mutable si immutable, de ce nui bine de folosit String
 * si de ce se foloseste StringBuilder si StringBuffer, si diferentele dintre ele
 * <p>
 * Scriti exemplu care foloseste ambele clase StringBuilder si StringBuffer
 */
public class StringBuilders {

    public static void main(String[] args) {
        System.out.println(StringBuilders.class.getName() + ": ");
        menu();
    }

    private static void varianta1() {
        //       StringBuffer este și mutabil și sincronizat, iar StrinBuilder este mutabil dar nesicronizat
        // TODO: De explicat ce inseamna Mutable si Immutable;
        // TODO: Fa rezultatul sa fie mai compact si mai clar

        System.out.println("Vasea");

        StringBuilder strBuilder = new StringBuilder("Core ");
        strBuilder.append(" Java ");
        System.out.println(strBuilder);
        strBuilder.append("SE");
        System.out.println(strBuilder);
        strBuilder.replace(0, 8, "Record Aj");
        System.out.println(strBuilder);
        strBuilder.insert(0, "Play ");
        System.out.println(strBuilder);
        // returns the current capacity of the String builder i.e. 16 +
        System.out.println("capacity=" + strBuilder.capacity());
        System.out.println(strBuilder.length());

        StringBuffer strBuffer = new StringBuffer("Salut");
        System.out.println(strBuffer);
        strBuffer.append(" Alex");
        System.out.println(strBuffer);
        strBuffer.replace(0, 5, "Privet");
        System.out.println(strBuffer);
        strBuffer.delete(3, 5);
        System.out.println(strBuffer);
        strBuffer.insert(4, "(aici au mai fost 'e' si 't')");
        System.out.println(strBuffer);
        // returns the current capacity of the String buffer i.e. 16 +
        System.out.println(strBuffer.capacity());
        System.out.println(strBuffer.length());
    }


    private static void varianta2() {
        System.out.println("Margarita");
        /* Ce inseamna mutable?
        Mutable inseamna ca la crearea unui obiect
        se aloca o "cutiuta" de memorie si apoi cand se lucreaza cu acest obiect
        si se introduc schimbari ele se pastreaza in aceeas cutiuta creata initial.
        Ce inseamna imutable?
        String e imutabil, de fiecare data cand se introduc ceva schimbari el aloca
        memorie noua, adica de fiecare data se creaza cutiuta noua.
         De ce nui bine de folosit string? Prin urmare daca
        este mult de lucru cu schimbari se umpla repede memoria.
        De ce se foloseste StringBuilder si StringBuffer?
        Aceste clase sunt mutabile deci economisesc memorie cand e nevoie de lucrat
        cu text care se modifica des.
         Diferentele dintre ele?
         StringBuilder   | StringBuffer
         nui singronizat | e sinhronizat
         nui tread safety| poate concomitent avea mai multe treaduri
         e mai rapid     | e mai incet din cauza ca e sincronizat
         */
        StringBuilder str = new StringBuilder("Java");
        str.append(8);
        str.delete(0, 1);
        System.out.println("Capacitatia: " + str.capacity());
        System.out.println(str);
        StringBuffer stb = new StringBuffer("hahaha");
        stb.append(7);
        stb.deleteCharAt(0);
        System.out.println("Capacitatia: " + stb.capacity());
        System.out.println(stb);


    }

    private static void varianta3() {
        // TODO: insert your name and code here
    }

    private static void varianta4() {
        // TODO: insert your name and code here
    }



    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("\nIntroduceti varianta 1-4, sau 0 pentru a iesi din program: ");
            varianta = scanner.nextInt();
            switch (varianta) {
                case 1:
                    varianta1();
                    break;
                case 2:
                    varianta2();
                    break;
                case 3:
                    varianta3();
                    break;
                case 4:
                    varianta4();
                    break;
                default:
                    System.out.println("Nu exista asa varianta!");
            }
        } while (varianta != 0);
    }
}
