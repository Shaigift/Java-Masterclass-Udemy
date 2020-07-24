package com.company;

public class Main {

    public static void main(String[] args) {
	/*Account bobsAccount = new Account();
	System.out.println(bobsAccount.getAccountNumber());
	System.out.println(bobsAccount.getAccountBalance());

	bobsAccount.setBalance(0.00);

	bobsAccount.withdrawal(100.0);

	bobsAccount.deposit(50.0);
	bobsAccount.withdrawal(100.0);

	bobsAccount.deposit(51);
	bobsAccount.withdrawal(100.0);*/

	Account mphosAccount = new Account("Mpho", "Mpho@email.com", "12345");
	System.out.println(mphosAccount.getNumber() + " name " + mphosAccount.getCustomerName());
	System.out.println("Current balance is " + mphosAccount.getAccountBalance());
	mphosAccount.withdrawal(100.55);


	/*VipPerson person1 = new VipPerson();
	System.out.println(person1.getName());

	VipPerson person2 = new VipPerson("Bob", 25000.00);
	System.out.println(person2.getName());

	VipPerson person3 = new VipPerson("Mpho", 100.00, "Mpho@gmail.com");
	System.out.println(person3.getName());
	System.out.println(person3.getEmailAddress());*/
    }
}
