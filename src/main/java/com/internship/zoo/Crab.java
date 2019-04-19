package com.internship.zoo;

/**
 * Created by Ion on 14-Apr-19.
 */
public class Crab {

    private String name;
    private int age;
    private int height;
    private float weight;
    private String shell;

    public Crab() {
    }

    public Crab(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Crab(String name, int age, int height, float weight, String shell) {
        this(name, age);
        this.height = height;
        this.weight = weight;
        this.shell = shell;
    }

    public void say() {
        System.out.println(this.name + " say Craaaaaaa");
    }

    public void hide() {
        System.out.println(this.name + " is hiding");
    }

    public void walk() {
        System.out.println(this.name + " is walking");
    }

    public void swim() {
        System.out.println(this.name + " is swiming");
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

}
