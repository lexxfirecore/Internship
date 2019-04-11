package com.internship.zoo;

public class Duck {
    private String name;
    private int age;
    private int height;
    private float weight;
    private boolean wild;

    public Duck() {
    }

    public Duck(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public Duck(String name, int age, int height , float weight, boolean wild) {
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.wild = wild;
    }



    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void walk(){
            System.out.println(this.getName() + " is walking");
        }

    public void fly(){
            System.out.println(this.getName() + " is flying");
        }

    public void swim(){
            System.out.println(this.getName() + " is swiming");
        }

    public void say(){
        System.out.println(this.getName() + " say Mac Mac");
    }

    public void migrate(){
        System.out.println(this.getName() + " is migrating");
    }

    public  void printDuckInfo(){
        System.out.println(this.getClass().getSimpleName() + " name is " + this.getName() );
        System.out.println(this.getName() + " is " + this.getAge() + " years old");
        System.out.println(this.getName() + " has " + this.getWeight() + " kg" );
        System.out.println(this.getName() + " height is " + this.getHeight() + " cm");
    }

    public void printDuck(){
        printDuckInfo();
        System.out.println(this.getName() + " is wild? - " + this.isWild());
        this.say();
        this.walk();
        this.swim();
        this.migrate();
        this.fly();
        System.out.println();

    }

}
