package com.internship.menagerie;

public class Duck extends Animal implements Flying, Swimming, Walking {
    private boolean wild;

    public Duck() {

    }

    public Duck(String name, int age, boolean wild) {
        super(name, age);
        this.wild = wild;
    }

    @Override
    public void say() {
        System.out.println("The " + this.getClass().getSimpleName() + " " + this.getName() + " say MAC MAC" );
    }

    @Override
    public String toString() {
        return "The " + this.getClass().getSimpleName() + " " +
                this.getName() + " is " + this.getAge() + " years old, is  " +
                this.getHeight() + " cm tol, has " + this.getWeight() + " kg. "
                + " Is wild? : " + isWild();
    }

    public void migrate(){
        System.out.println(this.getName() + " is migrating");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flying");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking");
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }
}
