package com.internship.zoo;

/**
 * Created by Margarita on 04-Apr-19.
 */
public class Cat {

    private String name;
    private int age;
    private int height;
    private float weight;
    private boolean mouseCatcher;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, float weight) {
        this(name, age);
        this.weight = weight;
    }

    public void say() {
        System.out.println("Pisica spune: Meaw");
    }

    public void walk() {
        System.out.println("Pesicile se plimba cand vor si pe unde vor!!!");
    }

    public void run() {
        System.out.println("Pisicele fug repede la mincare si de la ciini)");
    }

    public void purr() {
        System.out.println("Pisica toarce de placere");
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

    public boolean isMouseCatcher() {
        return mouseCatcher;
    }

    public void setMouseCatcher(boolean mouseCatcher) {
        this.mouseCatcher = mouseCatcher;
    }
}
