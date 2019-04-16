package com.internship.zoo;
/**
 * Created by vmarian on 11-Apr-19.
 */
public class Dog {
    private String name;
    private int age;
    private int height;
    private float weight;
    private boolean trained;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public Dog(String name, int age, int height , float weight, boolean trained) {
        this(name, age);
        this.setHeight(height);
        this.setWeight(weight);
        this.trained = trained;
    }
    public void say(){
        System.out.println("Ciinele latra Hau Hau");
    }

    public void walk(){
        System.out.println("Ciinele se plimba in parc");
    }

    public void swim(){
        System.out.println("Ciinele stie a inota");
    }

    public void run(){
        System.out.println("Ciinele fuge dupa pisici");
    }

    public void wagging(){
        System.out.println("Ciinele da din coada");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
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

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }
}
