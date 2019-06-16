package com.internship.menagerie;

public class Cat extends Animal implements Walking, Running{
    private boolean mouseCatcher;

    public Cat() {
    }

    public Cat(String name, int age, boolean mouseCatcher) {
        super(name, age);
        this.mouseCatcher = mouseCatcher;
    }

    @Override
    public void say() {
        System.out.println("The " + this.getClass().getSimpleName() + " " + this.getName() + " say MIAU" );
    }

    @Override
    public String toString() {
        return "The " + this.getClass().getSimpleName() + " " +
                this.getName() + " is " + this.getAge() + " years old, is  " +
                this.getHeight() + " cm tol, has " + this.getWeight() + " kg. " +
                "Does it mouse catcher ? : " + this.isMouseCatcher();
    }

    public void purr(){
        System.out.println(this.getName() + " do PRRRRRRRRRR");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking");
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running");
    }

    public boolean isMouseCatcher() {
        return mouseCatcher;
    }

    public void setMouseCatcher(boolean mouseCatcher) {
        this.mouseCatcher = mouseCatcher;
    }
}
