package com.internship.menagerie;

public class Dolphin extends Animal implements Swimming {
    private int intellegence; //adauga range



    public Dolphin() {
    }

    public Dolphin(String name, int age, int intellegence) {
        super(name, age);
        this.intellegence = intellegence;
        inteligenceValidation(intellegence);
    }

    @Override
    public void say() {
        System.out.println("The " + this.getClass().getSimpleName() + " " + this.getName() + " say KRRRRRRRRR" );
    }

    @Override
    public String toString() {
        return "The " + this.getClass().getSimpleName() + " " +
                this.getName() + " is " + this.getAge() + " years old, is  " +
                this.getHeight() + " cm tol, has " + this.getWeight() + " kg. " +
                "It has : " + this.getIntellegence() + " inteligence points";
    }

    public void jump() {
    System.out.println(this.getName() + " is jumping");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming");
    }

    public int getIntellegence() {
        return intellegence;
    }

    public void setIntellegence(int intellegence) {
        this.intellegence = intellegence;
        inteligenceValidation(intellegence);
    }

    public static void inteligenceValidation(int inteligence){
        if(inteligence <= 0 || inteligence > 100){
            System.out.println("Dolphin inteligence invalid value - system exit");
            System.exit(0);
        }
    }
}
