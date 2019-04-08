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
    }

    private static void zoo_1() {

    }

    private static void zoo_2() {
        Dolphin dolfi = new Dolphin();
        dolfi.setName("yoyo");
        dolfi.setAge(5);
        dolfi.setHeight(2);
        dolfi.setWeight(30.4f);
        dolfi.setIntellegence(50);
        printDolphin(dolfi);
        dolfi.jump();
        dolfi.say();
        dolfi.swim();

        Dolphin dolf = new Dolphin("Dulcea", 5);
        dolf.setHeight(3);
        dolf.setWeight(29.5f);
        dolf.setIntellegence(60);
        printDolphin(dolf);
        dolf.jump();
        dolf.say();
        dolf.swim();

        Dolphin dodo = new Dolphin("Kobo", 4, 3);
        dodo.setWeight(35f);
        dodo.setIntellegence(45);
        printDolphin(dodo);
        dodo.jump();
        dodo.say();
        dodo.swim();


        Cat mur = new Cat();
        mur.setName("Casandra");
        mur.setAge(2);
        mur.setHeight(1);
        mur.setWeight(3.4f);
        mur.setMouseCatcher(true);
        printCat(mur);
        mur.purr();
        mur.run();
        mur.walk();
        mur.say();

        Cat meau = new Cat("Monea", 4);
        meau.setHeight(1);
        meau.setWeight(4f);
        meau.setMouseCatcher(true);
        printCat(meau);
        meau.purr();
        meau.run();
        meau.walk();
        meau.say();

        Cat murmur = new Cat("Murca", 2, 3);
        murmur.setHeight(1);
        murmur.setMouseCatcher(true);
        printCat(murmur);
        murmur.purr();
        murmur.run();
        murmur.walk();
        murmur.say();


    }

    private static void zoo_3() {

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("\nIntroduceti varianta 1-3, sau 0 pentru a iesi din program: ");
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
                case 0:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Nu exista asa varianta!");
            }
        } while (varianta != 0);
    }

    private static void printCat(Cat c) {
        System.out.println("\nCat: Name: " + c.getName() + " ,Age: " + c.getAge() + " ,Height: " + c.getHeight() + " ,Weight: " + c.getWeight() + " ,MouseCatcher: " + c.isMouseCatcher());
    }

    private static void printDolphin(Dolphin d) {
        System.out.println("\nDolphin: Name: " + d.getName() + " ,Age: " + d.getAge() + " ,Height: " + d.getHeight() + " ,Weight: " + d.getWeight() + " ,Intellegence: " + d.getIntellegence());
    }

}
