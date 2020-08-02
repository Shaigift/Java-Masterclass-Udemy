package com.company;

public class Main {

    public static void main(String[] args) {


        Bank bank = new Bank("HISA Bank");


        if(bank.addBranch("Maargon")) {
            System.out.println("Maargon branch created");
        };

        bank.addCustomer("Maargon", "Mpho", 150.54);
        bank.addCustomer("Maargon", "Mike", 175.54);
        bank.addCustomer("Maargon", "Mandy", 220.54);

        bank.addBranch("Liquid");
        bank.addCustomer("Maargon", "Mpho", 150.54);

        bank.addCustomerTransaction("Maargon", "Mpho", 42.22);
        bank.addCustomerTransaction("Maargon", "Mandy", 12.44);
        bank.addCustomerTransaction("Maargon", "Mardon", 1.65);

        bank.listCustomers("Maargon", true);
        bank.listCustomers("Midrand", true);

        bank.addBranch("Johannesburg");
        if(!bank.addCustomer("Johannesburg", "Stella", 5.43)){
            System.out.println("Error Johannesburg branch does not exist");
        }
        if(!bank.addBranch("Maargon")){
            System.out.println("Maargon already exists.");
        }
        if(!bank.addCustomerTransaction("Maargon", "Faro", 53.33)){
            System.out.println("Customer does not exist at branch.");
        }
        if(!bank.addCustomer("Maargon", "Tim", 12.21)){
            System.out.println("Customer Tim already exists.");
        }
    }
}
