package com.internship.zoo;

public class Crab {
    private String name;
    private int age;
    private int height;
    private float weight;
    private String shell;

    public Crab() {
    }

    public Crab(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public Crab(String name, int age, int height , float weight, String shell) {
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.shell = shell;
    }

    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
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

    public void say(){
        System.out.println(this.getName() + " say Craaaaaaa");
    }

    public void hide(){
        System.out.println(this.getName() + " is hiding");
    }

    public void walk(){
        System.out.println(this.getName() + " is walking");
    }

    public void swim(){
        System.out.println(this.getName() + " is swiming");
    }

    public void printDuckInfo(){
        System.out.println(this.getClass().getSimpleName() + " name is " + this.getName() );
        System.out.println(this.getName() + " is " + this.getAge() +  " years old");
        System.out.println(this.getName() + " has " + this.getWeight() + " kg" );
        System.out.println(this.getName() + " height is " + this.getHeight() + " cm");
    }

    public  void printCrab(){
        printDuckInfo();
        System.out.println(this.getName() + " has " + this.getShell() + " shell");
        this.say();
        this.walk();
        this.swim();
        this.hide();
        System.out.println();


    }
}
