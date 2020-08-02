package com.company;

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
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transctions;
    }
}
