package com.internship.zoo;

public class Dolphin {
    private String name= "Swit";
    private int age= 5;
    private int height = 5;
    private float weight=100;
    private int intellegence=50;

    public Dolphin() {
        System.out.println("Delfinul a fost creat!");
    }

    public Dolphin(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: "+name+", Age: "+age);
    }

    public Dolphin(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
        System.out.println("Name: "+name+", Age: "+age+", Height: "+height);
    }

    public Dolphin(String name, int age, int height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Dolphin(String name, int age, int height, float weight, int intellegence) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.intellegence = intellegence;
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

    public int getIntellegence() {
        return intellegence;
    }

    public void setIntellegence(int intellegence) {
        this.intellegence = intellegence;
    }


    public static void say(){
        System.out.println("Dolphin says: ioooii  ");
    }
    public static void swim(){
        System.out.println(" Delfinii pot sa inoate cu o viteza de 55,5 Km/h");

    }
    public static void jump(){
        System.out.println("Delfinii des sar pentru distractie");
    }
}
