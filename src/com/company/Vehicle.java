package com.company;

public class Vehicle {
<<<<<<< HEAD

    private String name;

    public Vehicle(String name) {
        this.name = name;
=======
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }
    public void move(int velocity, int direction){
        currentDirection = velocity;
        currentVelocity = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void stop() {
        this.currentVelocity = 0;
>>>>>>> b12daa1a24950adb009587a54d481cc51e628fc1
    }
}
