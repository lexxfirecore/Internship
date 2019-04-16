package com.internship;

import com.internship.zoo.*;


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
        System.out.println("\nSa creat ciinele.");
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setAge(2);
        dog.setHeight(35);
        dog.setWeight(4.2f);
        dog.setTrained(true);
        printDog(dog);
        dog.say();
        dog.swim();
        dog.run();
        dog.walk();
        dog.wagging();

        Dog dogs = new Dog("Muhtar", 3);
        dogs.setHeight(44);
        dogs.setWeight(5.1f);
        dogs.setTrained(true);
        printDog(dogs);
        dogs.say();
        dogs.swim();
        dogs.run();
        dogs.walk();
        dogs.wagging();

        Dog dogg = new Dog("Laika", 1, 24, 2.7f,true);
        printDog(dogg);
        dogg.say();
        dogg.swim();
        dogg.run();
        dogg.walk();
        dogg.wagging();

        System.out.println("\nSa creat porumbelul.");
        Dove dove = new Dove();
        dove.setName("Cipi");
        dove.setAge(1);
        dove.setHeight(11);
        dove.setWeight(1.2f);
        dove.setPostman(true);
        printDove(dove);
        dove.say();
        dove.fly();
        dove.walk();
        dove.sendMessage();

        Dove dowe = new Dove("Shinji King", 2);
        dowe.setHeight(15);
        dowe.setWeight(1.2f);
        dowe.setPostman(true);
        printDove(dowe);
        dowe.say();
        dowe.fly();
        dowe.walk();
        dowe.sendMessage();

        Dove dov = new Dove("Coada Alba", 3, 14, 1.6f,true);
        printDove(dov);
        dov.say();
        dov.fly();
        dov.walk();
        dov.sendMessage();
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
        Duck mcDuk =  new Duck();
        mcDuk.setName("McDuk");
        mcDuk.setAge(2);
        mcDuk.setHeight(10);
        mcDuk.setWeight(21.0f);
        mcDuk.setWild(false);
        printDuck(mcDuk);


        Duck mcCuk = new Duck("McCuc", 2);
        mcCuk.setHeight(10);
        mcCuk.setWeight(25.0f);
        mcCuk.setWild(true);
        printDuck(mcCuk);


        Duck mcCook = new Duck("McCook", 3, 10, 20.0f, true);
        printDuck(mcCook);

        Crab lobster = new Crab();
        lobster.setName("Lobster");
        lobster.setAge(2);
        lobster.setHeight(25);
        lobster.setWeight(40.0f);
        lobster.setShell("MegaPegaStrong");
        printCrab(lobster);

        Crab iobster = new Crab("Iobster", 3);
        iobster.setHeight(40);
        iobster.setWeight(41.0f);
        iobster.setShell("OmegaStrong");
        printCrab(iobster);

        Crab ibaster = new Crab("Ibaster", 2, 10, 21.0f, "UltraMegaStrong");
        printCrab(ibaster);
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
    private static void printDog(Dog dog) {
        System.out.println("\nNume: " + dog.getName() + ", Age: " + dog.getAge() + ", Height: " + dog.getHeight()+
                ", Weight: " + dog.getWeight() + ", Trained: " + dog.isTrained());

    }

    private static void printDove(Dove dove) {
        System.out.println("\nNume: " + dove.getName() + ", Age: " + dove.getAge() + ", Height: " + dove.getHeight()+
                ", Weight: " + dove.getWeight() + ", Postman: " + dove.isPostman());

    }
    private static void printCat(Cat c) {
        System.out.println("\nCat: Name: " + c.getName() + " ,Age: " + c.getAge() + " ,Height: " + c.getHeight() + " ,Weight: " + c.getWeight() + " ,MouseCatcher: " + c.isMouseCatcher());
    }

    private static void printDolphin(Dolphin d) {
        System.out.println("\nDolphin: Name: " + d.getName() + " ,Age: " + d.getAge() + " ,Height: " + d.getHeight() + " ,Weight: " + d.getWeight() + " ,Intellegence: " + d.getIntellegence());
    }

    public static void printDuck(Duck duck){
        System.out.println(duck.getClass().getSimpleName() + " name is " + duck.getName());
        System.out.print(duck.getName() + " is " + duck.getAge() + " years old ");
        System.out.print("and has " + duck.getWeight() + " kg, " );
        System.out.println("it height is " + duck.getHeight() + " cm");
        System.out.println(duck.getName() + " is wild? - " + duck.isWild());
        duck.say();
        duck.walk();
        duck.swim();
        duck.migrate();
        duck.fly();
        System.out.println();
}


    public static void printCrab(Crab crab) {
        System.out.println(crab.getClass().getSimpleName() + " name is " + crab.getName());
        System.out.print(crab.getName() + " is " + crab.getAge() + " years old ");
        System.out.print("and has " + crab.getWeight() + " kg, ");
        System.out.println("it height is " + crab.getHeight() + " cm");
        System.out.println(crab.getName() + " has " + crab.getShell() + " shell");
        crab.say();
        crab.walk();
        crab.swim();
        crab.hide();
        System.out.println();
    }

}
