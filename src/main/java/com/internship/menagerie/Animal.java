package com.internship.menagerie;

public class Animal {
private String name;
private int age;
private int height;
private float weight;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, int height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void say(){  //implementarea
    System.out.println("Animal can say");
}

    @Override
    public String toString() {
        return "The " + this.getClass().getSimpleName() + " " + this.getName() + " is " + this.getAge() + " years old, is  " + this.getHeight() + " cm tol, has " + this.getWeight() + " kg";
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
