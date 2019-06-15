package com.internship.menagerie;


import java.util.ArrayList;
import java.util.List;

public class Main {

   // public static void main(String[] args) {
   //     main();
   // }

    public static void main(){
        //Cat objects
        Animal murzicCat = new Cat();
        murzicCat.setName("Murzic");
        murzicCat.setAge(3);
        murzicCat.setHeight(20);
        murzicCat.setWeight(23.50f);
        // nu putem seta variabila mouseChatcher fiidca referinta Animal nu contine aceasta metoda

        Cat murcaCat = new Cat("Murca", 2, true);
        murcaCat.setHeight(20);
        murcaCat.setWeight(10.2f);

        // Crab objects
        Animal iobsterCrab = new Crab();
        iobsterCrab.setName("Iobster");
        iobsterCrab.setAge(20);
        iobsterCrab.setHeight(2);
        iobsterCrab.setWeight(2.3f);

        Crab ibasterCrab = new Crab("Ibaster", 3, "Obsidian shell");
        ibasterCrab.setHeight(3);
        ibasterCrab.setWeight(2.5f);

        //Dog objects
        Animal griveiDog = new Dog();
        griveiDog.setName("Grivei");
        griveiDog.setAge(20);
        griveiDog.setHeight(2);
        griveiDog.setWeight(2.3f);

        Dog azorelDog = new Dog("Azorel", 3, true);
        azorelDog.setHeight(3);
        azorelDog.setWeight(2.5f);

        //Dolphin objects
        Animal flufyDolphin = new Dolphin();
        flufyDolphin.setName("Flufy");
        flufyDolphin.setAge(20);
        flufyDolphin.setHeight(5);
        flufyDolphin.setWeight(5.5f);

        Dolphin fofyDolphin = new Dolphin("Fofy", 3, 100);
        fofyDolphin.setHeight(3);
        fofyDolphin.setWeight(10.5f);

        //Dove objects
        Animal guleaguleaDove = new Dove();
        guleaguleaDove.setName("Gulea - Gulea");
        guleaguleaDove.setAge(20);
        guleaguleaDove.setHeight(5);
        guleaguleaDove.setWeight(5.5f);

        Dove fufulelDove = new Dove("Fufulel", 3, true);
        fufulelDove.setHeight(3);
        fufulelDove.setWeight(10.5f);

        //Duck objects
        Animal mcDuck = new Duck();
        mcDuck.setName("McDuck");
        mcDuck.setAge(20);
        mcDuck.setHeight(5);
        mcDuck.setWeight(5.5f);

        Duck mcCack = new Duck("McCack", 3, false);
        mcCack.setHeight(3);
        mcCack.setWeight(10.5f);

        //Crearea listei de tip generic Animal
        List<Animal> animalList = new ArrayList<>();
        animalList.add(murcaCat);
        animalList.add(murzicCat);
        animalList.add(iobsterCrab);
        animalList.add(ibasterCrab);
        animalList.add(griveiDog);
        animalList.add(azorelDog);
        animalList.add(flufyDolphin);
        animalList.add(fofyDolphin);
        animalList.add(guleaguleaDove);
        animalList.add(fufulelDove);
        animalList.add(mcDuck);
        animalList.add(mcCack);

        printAnimalElementsFields(animalList);

        listElemsToString(animalList);

        //Crearea listelor de tipul generic al interfetelor
        List<Walking> walkingAnimalsList =  new ArrayList<>(); //???????
        List<Running> runningAnimalsList =  new ArrayList<>();
        List<Swimming> swimmingAnimalsList =  new ArrayList<>();
        List<Flying> flyingAnimalsList =  new ArrayList<>();

        //metoda de populare a listelor cu elemente care implementeaza metodele din interfete
        createListsByInterface(animalList, walkingAnimalsList, runningAnimalsList, swimmingAnimalsList, flyingAnimalsList);

        callAnimalsToWalk(walkingAnimalsList);
        callAnimalsToRun(runningAnimalsList);
        callAnimalsToSwimm(swimmingAnimalsList);
        callAnimalsToFly(flyingAnimalsList);

        //Bonus
        runAnimalSubclassInstacesMethods(animalList);
    }


   public static void createListsByInterface (List <Animal> animalList, List<Walking> walking, List<Running> running, List<Swimming> swimming, List<Flying> flying ) {
        for(Animal animal : animalList ){
            if(animal instanceof Walking){
                walking.add((Walking) animal);
            }else if (animal instanceof Running){
                running.add((Running) animal);
            }else if (animal instanceof Swimming){
                swimming.add((Swimming) animal);
            }else if (animal instanceof Flying){
                flying.add((Flying) animal);
            }else{
                System.out.println("Unknown instance");
            }
        }
    }

    public static void printAnimalElementsFields(List<Animal> animalList) {
        for (Animal animal : animalList) {
            System.out.println("The " + animal.getClass().getSimpleName() + " " + animal.getName() + " is " + animal.getAge() + " years old,  is " + animal.getHeight() + " cm tol and has " + animal.getWeight() + " kg.");
            animal.say();
        }
    }

    public static void runAnimalSubclassInstacesMethods(List<Animal> animalList) {
        for (Animal animal : animalList) {
            if (animal instanceof Cat) {
                ((Cat) animal).purr();
            } else if (animal instanceof Crab) {
                ((Crab) animal).hide();
            } else if (animal instanceof Dog) {
                ((Dog) animal).wagging();
            } else if (animal instanceof Dove) {
                ((Dove) animal).sendMessage();
            } else if (animal instanceof Dolphin) {
                ((Dolphin) animal).jump();
            } else if (animal instanceof Duck) {
                ((Duck) animal).migrate();
            } else {
                System.out.println("Nam ideie ce poate animalu ista");
            }
        }
    }

    public static void listElemsToString(List<Animal> animals){
        for(Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

    public static void callAnimalsToWalk(List<Walking> walkingAnimalsList){
        for(Walking walkingAnimal : walkingAnimalsList){
            walkingAnimal.walk();
        }
    }

    public static void callAnimalsToRun(List<Running> runningAnimalsList){
        for(Running runningAnimal : runningAnimalsList){
            runningAnimal.run();
        }
    }

    public static void callAnimalsToSwimm(List<Swimming> swimmingsAnimalsList){
        for(Swimming swimmingAnimal : swimmingsAnimalsList){
            swimmingAnimal.swim();
        }
    }

    public static void callAnimalsToFly(List<Flying> flyingAnimalsList){
        for(Flying flyingAnimal :  flyingAnimalsList){
            flyingAnimal.fly();
        }
    }


}
