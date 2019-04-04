package com.internship.zoo;


import javax.print.attribute.standard.PrinterInfo;

interface Talking{
    void say();
}

interface Walking{  // nada darabotati
    default void walk(Animal animal){
        System.out.println( animal.getName() + " is walking");
    }
}

interface Flying{
    default void fly(Animal animal){
        System.out.println(animal.getName() + " is flying");
    }
}

interface Swiming{
    default void swim(Animal animal){
        System.out.println(animal.getName() + " is swiming");
    }
}

interface Running{
    default void run(Animal animal){
        System.out.println(animal.getName() + " is running");
    }
}



public abstract class Animal {
    private String name;
    private int age;
    private int height;
    private float weight;

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

class Dog extends Animal implements Talking, Walking, Swiming, Running{

    private boolean trained;

    public Dog(){
        }

    public Dog(String name, int age, int height , float weight,  boolean trained){
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public void say(){
        System.out.println(this.getName() + "say Woof Woof");
    }

    public void wagging(){
        System.out.println(this.getName() + " is wagging");
    }
}

class Duck extends Animal implements Talking, Walking, Flying, Swiming{
   private boolean wild;

    public Duck() {
    }

    public Duck(String name, int age, int height , float weight, boolean wild) {
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.wild = wild;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public void say(){
        System.out.println(this.getName() + "say Mac Mac");
    }

    public void migrate(){
        System.out.println(this.getName() + " is migrating");
    }

}

class Dolphin extends Animal implements Talking, Swiming{
   private int inteligence; // trebuie de adaugat range?

    public Dolphin() {
    }

    public Dolphin(String name, int age, int height , float weight, int inteligence) {
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.inteligence = inteligence;
    }

    public int getInteligence() {
        return inteligence;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }

    public void say(){
        System.out.println(this.getName() + "say Iuuuuu-AAAAAAA");
    }

    public void jump(){
        System.out.println(this.getName() + " is jumping");
    }
}

class Cat extends Animal implements Talking, Walking, Swiming, Running{
   private boolean mouseCatcher;

    public Cat() {
    }

    public Cat(String name, int age, int height , float weight, boolean mouseCatcher) {
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.mouseCatcher = mouseCatcher;
    }

    public boolean isMouseCatcher() {
        return mouseCatcher;
    }

    public void setMouseCatcher(boolean mouseCatcher) {
        this.mouseCatcher = mouseCatcher;
    }

    public void say(){
        System.out.println(this.getName() + "say Miau Miau");
    }

    public void purr(){
        System.out.println(this.getName() + " is purring");
    }
}

class Dove extends Animal implements Talking, Walking, Flying{
   private boolean postman;

    public Dove() {
    }

    public Dove(String name, int age, int height , float weight, boolean postman) {
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.postman = postman;
    }

    public boolean isPostman() {
        return postman;
    }

    public void setPostman(boolean postman) {
        this.postman = postman;
    }

    public void say(){
        System.out.println(this.getName() + "say Woo woo woo");
    }

    public void sendMessage(){
        System.out.println(this.getName() + " is sending message");
    }
}

class Crab extends Animal implements Talking, Walking, Swiming{
   private String shell;

    public Crab() {
    }

    public Crab(String name, int age, int height , float weight, String shell) {
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.shell = shell;
    }

    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    public void say(){
        System.out.println(this.getName() + "say Craaaaaaa");
    }

    public void hide(){
        System.out.println(this.getName() + " is hiding");
    }
}

 class Menagerie {
    public static void main(String[] args) {
        Dog bobic_dog = new Dog("Bobic", 3, 50, 3.1f, true);
        Dog grivei_dog = new Dog("Grivei", 2, 45, 4.2f,  false);
        Dog azor_dog = new Dog("Azor", 1, 25, 2.2f, false);
        Dove mirk_dove = new Dove("Mirk", 2, 20, 1f, false );
        Dove icq_dove = new Dove("ICQ", 3, 30, 1.5f, false);
        Dove hulea_hulea_dove = new Dove("Hulea-Hulea", 1, 10, 0.5f, true );

      printDog(bobic_dog);
      printDog(grivei_dog);
      printDog(azor_dog);
      printDove(mirk_dove);
      printDove(icq_dove);
      printDove(hulea_hulea_dove);

    }

    public static void printAnimalInfo(Animal animal){
        System.out.println(animal.getClass().getSimpleName() + " name is " + animal.getName() );
        System.out.println(animal.getName() + " is " + animal.getAge() + " old");
        System.out.println(animal.getName() + " has " + animal.getWeight() + " kg" );
        System.out.println(animal.getName() + " height is " + animal.getHeight() + " cm");
    }

    public static void printDog(Dog dog){
        printAnimalInfo(dog);
        System.out.println(dog.getName() + " is trained? - " + dog.isTrained());
        dog.say();
        dog.walk(dog);
        dog.run(dog);
        dog.swim(dog);
        dog.wagging();
    }

     public static void printDove(Dove dove){
         printAnimalInfo(dove);
         System.out.println(dove.getName() + " is postman? - " + dove.isPostman());
         dove.say();
         dove.walk(dove);
         dove.fly(dove);
         dove.sendMessage();

     }
}