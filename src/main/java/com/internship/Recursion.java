package com.internship;

import java.util.InputMismatchException;
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
        /*
        Created by Ion 26/04/19
         */
        System.out.println("Variant 3 - Ion");
        System.out.println("Input a number greater or equal 0 and less than " + Integer.MAX_VALUE + ":");
        Scanner scanner = new Scanner(System.in);

        //Subtask 1
        int i = getValidatedInt(scanner);
        if (i >= 0) {
            System.out.println("!" + i + " = " + factorial(i));
        }

        //Subtask 2
        int guests = i;
        if (guests >= 0) {
            System.out.println("Numbers of " + guests + " guests handshakes : " + numOfHandShakes(guests));

        }

    }

    //factorial() by Ion - Subtask 1
    public static long factorial(int i) {
        if (i == 0) {
            return 1;
        } else {
            return (i * factorial(i - 1));
        }
    }

    // Ion invention - plizz dont delete from project (recursion example)
//    public static long numOfHandShakes2(int numOfGuests) {
//        if (numOfGuests <= 1) {
//            return 0;
//        } else {
//            return (numOfGuests - 1) + numOfHandShakes(numOfGuests - 1);
//        }
//    }

    //Subtask 2  Ion - refactored
    public static long numOfHandShakes(int numOfGuests) {
        if (numOfGuests >= 1) {
            return factorial(numOfGuests) / (factorial(numOfGuests - 2) * (factorial(numOfGuests - (numOfGuests - 2))));
        } else {
            return 0;
        }
    }
        //Get validated input num - by Ion
        public static int getValidatedInt (Scanner scanner){
            try {
                int i = scanner.nextInt();
                if (i >= 0 && i <= Integer.MAX_VALUE) {
                    return i;
                } else {
                    System.out.println("Wrong number : Input a number greater or equal 0 and less than " + Integer.MAX_VALUE + ":");
                    return -1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong number : Input a number greater or equal 0 and less than " + Integer.MAX_VALUE + ":");
                return -1;
            }
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
