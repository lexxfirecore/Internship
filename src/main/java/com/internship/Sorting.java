package com.internship;

import java.util.Scanner;

/**
 * Created by lexx on 23-Apr-19.
 */
public class Sorting {
    public static void main(String[] args) {
        System.out.println(Sorting.class.getName() + ": ");
        menu();
    }

    private static void sort_1() {

    }

    private static void sort_2() {

    }

    private static void sort_3() {

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("\nIntroduceti varianta 1-3, sau 0 pentru a iesi din program: ");
            varianta = scanner.nextInt();
            switch (varianta) {
                case 1:
                    sort_1();
                    break;
                case 2:
                    sort_2();
                    break;
                case 3:
                    sort_3();
                    break;
                case 0:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Nu exista asa varianta!");
            }
        } while (varianta != 0);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
