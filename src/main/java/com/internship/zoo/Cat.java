package com.internship.zoo;

import java.sql.SQLOutput;

public class Cat {
    private String name= "Murca";
    private int age= 1;
    private int height = 1;
    private float weight=2;
    private boolean mouseCatcher=true;

    public Cat() {
        System.out.println("Pisica a fost creata!");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: "+name+", Age: "+age);
    }

    public Cat(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("Name: "+name+", Age: "+age+", Weight: "+weight);
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
    public static void say(){
        System.out.println("Pisica spune: Meaw");
    }
    public static void walk(){
        System.out.println("Pesicile se plimba cand vor si pe unde vor!!!");
    }
    public static void run(){
        System.out.println("Pisicele fug repede la mincare si de la ciini)");
    }
    public static void purr (){
        System.out.println("Pisica toarce de placere");
    }
}
