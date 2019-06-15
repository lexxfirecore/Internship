package com.internship.menagerie;

public class Dove extends Animal implements Flying, Walking {
    private boolean postman;

    public Dove() {
    }

    public Dove(String name, int age, boolean postman) {
        super(name, age);
        this.postman = postman;
    }

    @Override
    public void say() {
        System.out.println("The " + this.getClass().getSimpleName() + " " + this.getName() + " say GULEA GULEA" );
    }

    @Override
    public String toString() {
        return "The " + this.getClass().getSimpleName() + " " +
                this.getName() + " is " + this.getAge() + " years old, is  " +
                this.getHeight() + " cm tol, has " + this.getWeight() + " kg. " +
                "Is postman? : " + this.isPostman();
    }

    public void sendMessage() {
        System.out.println(this.getName() + " is sending message");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flying");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking");
    }

    public boolean isPostman() {
        return postman;
    }

    public void setPostman(boolean postman) {
        this.postman = postman;
    }
}
