package com.internship.zoo;

/**
 * Created by Ion on 14-Apr-19.
 */
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

    public Duck(String name, int age, int height, float weight, boolean wild) {
        this(name, age);
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.wild = wild;
    }

    public void walk() {
        System.out.println(this.name + " is walking");
    }

    public void fly() {
        System.out.println(this.name + " is flying");
    }

    public void swim() {
        System.out.println(this.name + " is swiming");
    }

    public void say() {
        System.out.println(this.name + " say Mac Mac");
    }

    public void migrate() {
        System.out.println(this.name + " is migrating");
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

}
