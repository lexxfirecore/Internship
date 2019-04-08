package com.internship;

import java.util.Scanner;

/**
 * Created by lexx on 08-Apr-19.
 */
public class TextProcessor {
    public static void main(String[] args) {
        System.out.println(TextProcessor.class.getName() + ": ");

        menu();

    }

    private static void textProcessor_1() {

    }

    private static void textProcessor_2() {

    }

    private static void textProcessor_3() {

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("\nIntroduceti varianta 1-3, sau 0 pentru a iesi din program: ");
            varianta = scanner.nextInt();
            switch (varianta) {
                case 1:
                    textProcessor_1();
                    break;
                case 2:
                    textProcessor_2();
                    break;
                case 3:
                    textProcessor_3();
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
