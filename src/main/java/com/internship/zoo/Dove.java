package com.internship.zoo;
/**
 * Created by vmarian on 11-Apr-19.
 */
public class Dove {
    private String name;
    private int age;
    private int height;
    private float weight;
    private boolean postman;
    public Dove(){
    }
    public Dove(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dove(String name, int i, int age, float weight, boolean b) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public static void say(){
        System.out.println("Porumbelu cinta: glu-glu");
    }

    public static void walk() {
        System.out.println("Plimbari in parc");
    }

    public static void fly() {
        System.out.println("Zboara la o inaltime de 900 metri.");
    }

    public static void sendMessage() {
        System.out.println("Din timpuri au fost postasi.");
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

    public boolean isPostman() {
        return postman;
    }

    public void setPostman(boolean postman) {
        this.postman = postman;
    }
}
