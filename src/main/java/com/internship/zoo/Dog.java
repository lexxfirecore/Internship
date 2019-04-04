package com.internship.zoo;

public class Dog {
    private String name;
    private int age;
    private int height;
    private float weight;
    private boolean trained=true;
  public Dog(){
      System.out.println("Sa creat ciinele.");
  }
  public Dog(String name, int age){
    this.name = name;
    this.age = age;
      System.out.println("Numele: " + name +", ani: " + age);
    }
  public Dog(String name, int age, float weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
      System.out.println("Numele: "+ name +", ani: "+ age +", \n" +
              "greutate: " + weight);
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

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }
    public static void say(){
        System.out.println("Ciinele latra: Ham");
    }
    public static void walk(){
        System.out.println("Plimbari in parc");
    }
    public static void swim(){
        System.out.println("Ciinele este un bun inotator");
    }
    public static void run(){
        System.out.println("Ciinele fuge dupa minge si pisici :D");
    }
    public static void wagging (){
        System.out.println("Ciinele sapa gropi :P");
    }
}
