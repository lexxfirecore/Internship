package com.internship;

import java.util.Scanner;

import com.internship.zoo.Cat;
import com.internship.zoo.Crab;
import com.internship.zoo.Dog;
import com.internship.zoo.Dolphin;
import com.internship.zoo.Dove;
import com.internship.zoo.Duck;

/**
 * Created by lexx on 22-Apr-19.
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(Recursion.class.getName() + ": ");
        menu();
    }

    private static void recursion_1() {

    }

    private static void recursion_2() {
        
    }

    private static void recursion_3() {

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("\nIntroduceti varianta 1-3, sau 0 pentru a iesi din program: ");
            varianta = scanner.nextInt();
            switch (varianta) {
                case 1:
                    recursion_1();
                    break;
                case 2:
                    recursion_2();
                    break;
                case 3:
                    recursion_3();
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
