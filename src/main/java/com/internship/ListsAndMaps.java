package com.internship;

import java.util.Scanner;

/**
 * Created by lexx on 03-Apr-19.
 */
public class ListsAndMaps {
    public static void main(String[] args) {
        System.out.println(ListsAndMaps.class.getName() + ": ");

        menu();

    }

    private static void lists_1() {

    }

    private static void lists_2() {

    }

    private static void lists_3() {

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("\nIntroduceti varianta 1-3, sau 0 pentru a iesi din program: ");
            varianta = scanner.nextInt();
            switch (varianta) {
                case 1:
                    lists_1();
                    break;
                case 2:
                    lists_2();
                    break;
                case 3:
                    lists_3();
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
