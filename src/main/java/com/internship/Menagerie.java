package com.internship;

import java.util.Scanner;

/**
 * Created by lexx on 23-Apr-19.
 */
public class Menagerie {
    public static void main(String[] args) {
        System.out.println(Menagerie.class.getName() + ": ");
        menu();
    }

    private static void menagerie_1() {

    }

    private static void menagerie_2() {

    }

    private static void menagerie_3() {

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {

            System.out.println("\nIntroduceti varianta 1-3, sau 0 pentru a iesi din program: ");
            varianta = scanner.nextInt();
            switch (varianta) {
                case 1:
                    menagerie_1();
                    break;
                case 2:
                    menagerie_2();
                    break;
                case 3:
                    menagerie_3();
                    break;
                case 0:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Nu exista asa varianta!");
            }
        } while (varianta != 0);
    }
}
