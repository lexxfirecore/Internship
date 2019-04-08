package com.internship.zoo;

/**
 * Created by Margarita on 04-Apr-19.
 */
public class Dolphin {
    private String name;
    private int age;
    private int height;
    private float weight;
    private int intellegence;

    public Dolphin() {

    }

    public Dolphin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dolphin(String name, int age, int height) {
        this(name, age);
        this.height = height;
    }


    public void say() {
        System.out.println("Dolphin says: ioooii  ");
    }

    public void swim() {
        System.out.println("Delfinii pot sa inoate cu o viteza de 55,5 Km/h");

    }

    public void jump() {
        System.out.println("Delfinii des sar pentru distractie");
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
}
