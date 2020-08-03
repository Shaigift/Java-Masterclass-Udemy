package com.company;

<<<<<<< HEAD
/**
 * Created by dev on 7/10/2015.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();
=======
public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() called");

    }
    public void move(int speed){
        System.out.println("Animal.move() called. Animal is moving at " + speed);

    }
>>>>>>> e3847987595f08bca2b732cb6b4a9c7419141e9b

    public String getName() {
        return name;
    }
<<<<<<< HEAD
=======

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
>>>>>>> e3847987595f08bca2b732cb6b4a9c7419141e9b
}
