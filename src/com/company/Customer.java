package com.company;

<<<<<<< HEAD
public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
=======
import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transctions;

    public Customer(String name,double initialAmount) {
        this.name = name;
        this.transctions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double amount) {
        this.transctions.add(amount);
>>>>>>> 400e446dd0d330095806e0e7eb71b4a89950dd6c
    }

    public String getName() {
        return name;
    }

<<<<<<< HEAD
    public double getBalance() {
        return balance;
    }

    public void setBalance(double v) {
        return;
=======
    public ArrayList<Double> getTransactions() {
        return transctions;
>>>>>>> 400e446dd0d330095806e0e7eb71b4a89950dd6c
    }
}
