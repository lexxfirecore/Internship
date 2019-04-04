package com.internship;

import com.internship.zoo.Cat;
import com.internship.zoo.Dolphin;

import java.util.Scanner;

/**
 * Created by lexx on 03-Apr-19.
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println(Zoo.class.getName() + ": ");

        menu();

        zoo_1();
        zoo_2();
        zoo_3();

    }

    private static void zoo_1() {

    }

    private static void zoo_2() {
        Dolphin dolfi = new Dolphin();
        Dolphin dolf = new Dolphin("Dulcea",5);
        Dolphin dodo = new Dolphin("Kobo",4,3);

        Dolphin.jump();
        Dolphin.say();
        Dolphin.swim();

        Cat mur = new Cat();
        Cat meau = new Cat("Monea",4);
        Cat murmur = new Cat("Murca",2,3);

        Cat.purr();
        Cat.run();
        Cat.say();
        Cat.walk();



    }

    private static void zoo_3() {

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("Introduceti varianta 1-3, sau 0 pentru a iesi din program: ");
            varianta = scanner.nextInt();
            switch (varianta) {
                case 1:
                    zoo_1();
                    break;
                case 2:
                    zoo_2();
                    break;
                case 3:
                    zoo_3();
                    break;
                default:
                    System.out.println("Nu exista asa varianta!");
            }
        } while (varianta != 0);
    }


}
