package com.internship.menagerie;

public class Dog extends Animal implements Walking, Running, Swimming{

    private boolean trained;

    public Dog() {
    }

    public Dog(String name, int age, boolean trained) {
        super(name, age);
        this.trained = trained;
    }

    @Override
    public void say() {
        System.out.println("The " + this.getClass().getSimpleName() + " " + this.getName() + " say WOOF WOOF" );
    }

    @Override
    public String toString() {
        return "The " + this.getClass().getSimpleName() + " " +
                this.getName() + " is " + this.getAge() + " years old, is  " +
                this.getHeight() + " cm tol, has " + this.getWeight() + " kg. "+
                "It is trained? :  " + this.isTrained();
    }

    public void wagging() {
        System.out.println(this.getName() + " is wagging");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking");
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming");
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }
}
