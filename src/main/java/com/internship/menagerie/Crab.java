package com.internship.menagerie;

public class Crab extends Animal implements Walking, Swimming{
    private String shell;

    public Crab() {
    }

    public Crab(String name, int age, String shell) {
        super(name, age);
        this.shell = shell;
    }

    @Override
    public void say() {
        System.out.println("The " + this.getClass().getSimpleName() + " " + this.getName() + " say FFFFFFF" );
    }

    @Override
    public String toString() {
        return "The " + this.getClass().getSimpleName() + " " +
                this.getName() + " is " + this.getAge() + " years old, is  " +
                this.getHeight() + " cm tol, has " + this.getWeight() + " kg. " +
                "Has " + this.getShell();
    }

    public void hide(){
        System.out.println(this.getName() + " is hiding");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming");
    }

    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }
}
