package com.company;

<<<<<<< HEAD
import com.company.Theatre;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
=======
<<<<<<< HEAD
public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
	   /* StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
*/      int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
=======
<<<<<<< HEAD
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        X x = new X(new Scanner(System.in));
        x.x();

    }
}
=======
<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {
	    String privateVar = "this is private to main()";

	    ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
    }
}
=======
<<<<<<< HEAD
import com.company.MyWindow;
=======
<<<<<<< HEAD
import com.company.BaseballPlayer;
import com.company.FootballPlayer;
import com.company.SoccerPlayer;
import com.company.Team;
=======
<<<<<<< HEAD
import java.util.ArrayList;
>>>>>>> a98d9e3d0b68b1aa64fdcb4002df7e7b5b2c81e1
>>>>>>> b74315b9ac8f8cbde99737d23528d4598802ce8c

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        MyWindow myWindow = new MyWindow("Complete Java");
        myWindow.setVisible(true);
    }
}
=======
<<<<<<< HEAD
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
      /*  adelaideCrows.matchResult(baseballTeam, 1, 1);*/

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
    }
}
=======
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);


        printDoubled(items);
    }
    private static void printDoubled(ArrayList<Integer> n) {
        for(Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
}
=======
<<<<<<< HEAD
import com.company.SearchTree;

public class Main {

    public static void main(String[] args) {
        // For this challenge, create an abstract class to define items that can be stored in a tree.
        // The class should contain 2 references to items which will represent the next and previous
        // items (in the case of a linked tree).
=======
<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {
        // For this challenge, create an abstract class to define items that can be stored in a list.
        // The class should contain 2 references to items which will represent the next and previous
        // items (in the case of a linked list).
>>>>>>> 264b5414781ee9cdd49af5a22601d7016f78d06f
        // I.e., if you call your abstract class ListItem, then it would have 2 member variables of
        // type ListItem that will hold references to the next/right and previous/left ListItems.
        //
        // The abstract class will also need to hold a value - try to be as flexible as possible
        // when defining the type of this value.
        //
        // The class will also need methods to move to the next item and back to the previous item,
        // and methods to set the next and previous items.
        //
        // You should also specify a compareTo() method that takes a parameter of the same type as the
        // class and returns 0 if the values are equal, greater than zero if the value sorts greater than
        // the parameter and less than zero if it sorts less than the parameter.
        //
<<<<<<< HEAD
        // Create a concrete class from your abstract tree item class and use this in a LinkedList
        // class to implement a linked tree that will add items in order (so that they are sorted
=======
        // Create a concrete class from your abstract list item class and use this in a LinkedList
        // class to implement a linked list that will add items in order (so that they are sorted
>>>>>>> 264b5414781ee9cdd49af5a22601d7016f78d06f
        // alphabetically). Duplicate values are not added.
        //
        // Note that you are creating your own LinkedList class here, not using the built-in Java one..
        //
<<<<<<< HEAD
        // The rules for adding an item to the linked tree are:
        //  If the head of the tree is null, make the head refer to the item to be added.
        //  If the item to be added is less than the current item in the tree, add the item before the
=======
        // The rules for adding an item to the linked list are:
        //  If the head of the list is null, make the head refer to the item to be added.
        //  If the item to be added is less than the current item in the list, add the item before the
>>>>>>> 264b5414781ee9cdd49af5a22601d7016f78d06f
        //      current item (i.e., make the previous item's "next" refer to the new item, and the new item's
        //      "next" refer to the current item).
        //  If the item to be added is greater than the current item, move onto the next item and compare
        //      again (if there is no next item then that is where the new item belongs).
        //
<<<<<<< HEAD
        // Care will be needed when inserting before the first item in the tree (as it will not have a previous
        // item).
        //
        // You will also need a method to remove an item from the tree.
=======
        // Care will be needed when inserting before the first item in the list (as it will not have a previous
        // item).
        //
        // You will also need a method to remove an item from the list.
>>>>>>> 264b5414781ee9cdd49af5a22601d7016f78d06f
        //
        // Hint: If you are creating classes with names such as List, LinkedList, Node etc, make sure that
        // you create your classes before referring to them. In previous videos we have often referred to
        // classes that we create later, but if you use names that IntelliJ recognises as Java classes (such
        // as LinkedList) then it will create imports for them and possibly cause you problems later.
        //
        // Optional: create a class to use your concrete class to implement a Binary Search Tree:
        // When adding items to a Binary Search Tree, if the item to be added is less than the current item
        // then move to the left, if it is greater than the current item then move to the right.
        //
        // The new item is added when an attempt to move in the required direction would involve following a
        // null reference.
        // Once again, duplicates are not allowed.
        //
<<<<<<< HEAD
        // Hint: to avoid typing loads of "addItem" lines, split a string into an array and create your tree in
        // a loop as in the example below.
        //

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        // Create a string data array to avoid typing loads of addItem instructions:
        String stringData = "5 7 3 9 8 2 1 0 4 6";
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";


        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }


        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
    }
}
=======
        // Hint: to avoid typing loads of "addItem" lines, split a string into an array and create your list in
        // a loop as in the example below.
        //
        // Create a string data array to avoid typing loads of addItem instructions:
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
        }
    }
}
=======
<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
/*
        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
       btnPrint.setOnClickListener(new ClickListener());*/
        boolean title;
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked/");
            }
        });
        listen();

    }
    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
=======
<<<<<<< HEAD
import com.company.ISaveable;
import com.company.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a simple interface that allows an object to be saved to some sort of storage medium.
        // The exact type of medium is not known to the interface (nor to the classes that implement it).
        // The interface will just specify 2 methods, one to return an ArrayList of values to be saved
        // and the other to populate the object's fields from an ArrayList.
        //
        // Create some sample classes that implement your saveable interface (we've used the idea of a game,
        // with Players and Monsters, but you can create any type of classes that you want).
        //
        // Override the toString() method for each of your classes so that they can be easily printed to enable
        // the program to be tested easier.
        //
        // In Main, write a method that takes an object that implements the interface as a parameter and
        // "saves" the values.
        // We haven't covered I/O yet, so your method should just print the values to the screen.
        // Also in Main, write a method that restores the values to a saveable object.
        // Again, we are not going to use Java file I/O; instead use the readValues() method below to
        // simulate getting values from a file – this allows you to type as many values as your class
        // requires, and returns an ArrayList.

        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
    /*    loadObject(tim);*/
        System.out.println(tim);

        Monster werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Strength= " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
=======
<<<<<<< HEAD
import com.company.DeskPhone;
import com.company.ITelephone;
import com.company.MobilePhone;
=======
<<<<<<< HEAD
import com.company.Album;
import com.company.Song;

>>>>>>> 77eef9825aecd69e91c73a9927b0d7f82405ee91
import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);




    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
<<<<<<< HEAD
            printMenu();
=======
>>>>>>> 77eef9825aecd69e91c73a9927b0d7f82405ee91
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
<<<<<<< HEAD
=======
                        printMenu();
>>>>>>> 77eef9825aecd69e91c73a9927b0d7f82405ee91
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
<<<<<<< HEAD
                            System.out.println("Now replaying " + listIterator.previous().toString());
=======
                            System.out.println("Now replaying" + listIterator.previous().toString());
>>>>>>> 77eef9825aecd69e91c73a9927b0d7f82405ee91
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
<<<<<<< HEAD
                            System.out.println("Now replaying " + listIterator.next().toString());
=======
                            System.out.println("Now playing " + listIterator.next().toString());
>>>>>>> 77eef9825aecd69e91c73a9927b0d7f82405ee91
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
<<<<<<< HEAD
                    printList(playList);
=======
                       printList(playList);
>>>>>>> 77eef9825aecd69e91c73a9927b0d7f82405ee91
                    break;
                case 5:
                    printMenu();
                    break;
<<<<<<< HEAD

=======
>>>>>>> 77eef9825aecd69e91c73a9927b0d7f82405ee91
                case 6:
                    if(playList.size() >0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
<<<<<<< HEAD

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }


    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }



    // Modify the playlist challenge so that the Album class uses an inner class.
    // Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
    // The inner SongList class will use an ArrayList and will provide a method to add a song.
    // It will also provide findSong() methods which will be used by the containing Album class
    // to add songs to the playlist.
    // Neither the Song class or the Main class should be changed.

















}
=======
            }
        }
    }
    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0- to quit\n" +
                "1- to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4- list songs in the playlist\n" +
                "5 - print available actions.\n"+
                "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==================");
    }

}
=======
<<<<<<< HEAD
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Mpho", 54.96);
	    Customer anotherCustomer;
	    anotherCustomer = customer;
	    anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(1);
		intList.add(3);
		intList.add(4);

		for(int i=0; i<intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
		intList.add(1,2);

		for(int i=0; i<intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
    }
}
=======
<<<<<<< HEAD
public class Main {
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
import java.util.ArrayList;
>>>>>>> 70c704a0b66936a295b3cebe6577a716372d1983
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
    private static MobilePhone mobilePhone = new MobilePhone("235546642");
>>>>>>> 926a7ab4f9e90c5eda170761301025020f6c0a40

    public static void main(String[] args) {


<<<<<<< HEAD
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
=======
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            
            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;

                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone = "+ phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated recprd");
        } else {
            System.out.println("Error updating record.");
        }

    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Succesfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }

    }
    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());

    }


    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }
    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                            "1 - to print contacts\n" +
                            "2 - to add a new contact\n" +
                            "3 - to update existing an existing contact\n" +
                            "4 - to remove an existing contact\n" +
                            "5 - query if an existing contact exists\n" +
                            "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}

=======
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printInstructions();
	    while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To proint the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current item number:");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name:");
        int itemNo = scanner.nextInt();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list0");
        }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
}
=======
<<<<<<< HEAD
import java.util.Scanner;

public class Main {

    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);

    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for(int i = 0; i<array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++) {
            int value = array[i];

            if(value < min) {
                min = value;
            }
        }
        return min;

    }
}
=======
<<<<<<< HEAD
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);
    }

    private static void modifyArray(int[] array){

        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
=======
<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i= 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i =0; i<array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i] + 1) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
=======
<<<<<<< HEAD
import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
>>>>>>> 29cdb74cc1866fc209e15541b5d921e95300eab4
        }
        return values;
    }

<<<<<<< HEAD
    public static void saveObject(ISaveable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }


}
=======
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i <array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}

=======
<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg",5.43);
        healthyBurger.addHamburgerAddition2("Lentils",3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();

=======
<<<<<<< HEAD

class Car{
    public boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
=======
<<<<<<< HEAD

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
>>>>>>> 1a695c9238b0a0f9f6b08b23c11faf500a27caf7
    }

    public String getName() {
        return name;
    }
<<<<<<< HEAD

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}


class Main {

    public static void main(String[] args) {
        // write your code here

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Ford Falcon");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());


    }

}
=======
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}
class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces take over universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

}

public class Main {

    public static void main(String[] args) {
        for(int i= 1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                            ": " + movie.getName() + "\n" +
                            "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();

        }

        return null;
>>>>>>> be91a48f3b1f227104592450d115f20b582398aa

    }

}
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50,false);
        System.out.println("Initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count printer = " + printer.getPagesPrinted());
    }
}
=======
<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {
	    /*Player player = new Player();
	    player.name = "Mpho";
	    player.health = 20;
	    player.weapon = "Sword";

	    int damage = 10;
	    player.loseHealth(damage);
	    System.out.println("Remaining health = " + player.healthRemaining());

	    damage = 11;
	    player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());*/
		EnhancedPlayer player = new EnhancedPlayer("Mpho", 50, "Sword");
		System.out.println("Intial health is " + player.getHealth());
    }
}
=======
<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

	    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6, "v2.44");

	    PC thePC = new PC(theCase, theMonitor, theMotherboard);
	    thePC.powerUP();

	    Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");

		Ceiling ceiling = new Ceiling(12,55);

		Bed bed = new Bed("Modern", 4,3,2,1);

		Lamp lamp = new Lamp("Classic", false, 75);

		Bedroom bedroom = new Bedroom("Tims", wall1,wall2,wall3,wall4,ceiling, bed, lamp);
		Bedroom.makeBed();

		bedroom.getLamp().turnOn();

	}
}
=======
<<<<<<< HEAD
public class Main extends Object {

    public static void main(String[] args) {


        Outlander outlander = new Outlander(36);
        outlander.steer(40);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }



}
=======
<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1,20, "long silky");
        dog.eat();
      /*  dog.walk();*/
        dog.run();
    }
}
=======
<<<<<<< HEAD
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
=======
<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car holden = new Car();
	    porsche.setModel("911");
	    System.out.println("Model is " + porsche.getModel());
    }
}
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 4da91b31094f2998c841b08f038a0ccb6d443113
>>>>>>> 9fb6a0940a2a1f1a99165fe2e4bae2c45afeb6ab
import java.util.Scanner;
>>>>>>> 587eb191e9b599181ca5455e7abd85f337f90ecf

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();

    }
}
=======
<<<<<<< HEAD

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
      /*  boolean first = true;*/

        while(true) {

            System.out.println("Enter number: ");
=======
        Scanner scanner = new Scanner(System.in);

<<<<<<< HEAD
        int counter = 0;
        int sum = 0;

        while(counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

>>>>>>> 9fb6a0940a2a1f1a99165fe2e4bae2c45afeb6ab
            boolean isAntInt = scanner.hasNextInt();

            if (isAntInt) {
                int number = scanner.nextInt();
<<<<<<< HEAD
/*

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }
*/

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }
            System.out.println("min=" + min + ", max= " + max);
            scanner.close();

        }
}
=======
                counter++;
                sum+= number;
               /* if(counter == 10) {
                    break;
                }*/
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum =" + sum);
        scanner.close();
        }
    }
=======
        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2020  - yearOfBirth;

        System.out.println("Your name is " + name +", you are " + age+ " years old.");


        scanner.close();
    }
}
=======
public class Main {
<<<<<<< HEAD

    public static void main(String[] args) {
	String numberAsString = "2018";
	System.out.println("numberAsString= " + numberAsString);

	double number = Double.parseDouble(numberAsString);
	System.out.println("number = " + number);

	numberAsString += 1;
	number += 1;

	System.out.println("numberAsString = " + numberAsString);
	System.out.println("number = " + number);
    }
}
=======
<<<<<<< HEAD

    public static void main(String[] args) {
        System.out.println("The sum of the sigits in number 125 is " + DigitSum(125));
    }

    private static int DigitSum(int number) {
        if(number < 10) {
            return -1;
        }
        int sum = 0;

        while (number>0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}

=======
<<<<<<< HEAD

    public static void main(String[] args) {
	    System.out.println("The sum is " + SumOdd.sumOdd(1,100));
	    System.out.println("The sum is " + SumOdd.sumOdd(-1,100));
	    System.out.println("The sum is " + SumOdd.sumOdd(100,100));
	    System.out.println("The sum is " + SumOdd.sumOdd(13,13));
	    System.out.println("The sum is " + SumOdd.sumOdd(100,1000));
    }
}
/*
#Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.

        Check that number is > 0, if it is not return false.

        If number is odd return true, otherwise  return false.

        Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.

        The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.

        It should call the method isOdd to check if each number is odd.

        The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.

        If those conditions are not satisfied return -1 from the method to indicate invalid input.

        Example input/output:

        * sumOdd(1, 100); → should return 2500

        * sumOdd(-1, 100); →  should return -1

        * sumOdd(100, 100); → should return 0

        * sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)

        * sumOdd(100, -100); → should return -1

        * sumOdd(100, 1000); → should return 247500


        TIP: use the remainder operator to check if the number is odd

        NOTE: Both methods  needs to be defined as public static like we have been doing so far in the course.
        NOTE: Do not add a  main method to solution code.*/
=======
<<<<<<< HEAD

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
	    for(int i=1; i<=1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if(count == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
=======
<<<<<<< HEAD

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.00, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.00, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.00, 5.0));
        System.out.println("10,000 at 6% interest = " + calculateInterest(10000.00, 6.0));

        for (int i = 1; i < 5; i++) {
            System.out.println("Loop " + i + "Hello!");

        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at" + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
        }
        System.out.println("*****************");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at" + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
        }


        int count = 0;
        for(int i=2; i<5; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }


        public static boolean isPrime(int n){
            if (n == 1) {
                return false;
            }
            for (int i=2; i <= n/2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));
=======
<<<<<<< HEAD

    public static void main(String[] args) {
	// write your code here
       /* int value = 3;
        if(value == 1){
            System.out.println("Value was 1");
        }
        else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }*/
        int switchValue = 2;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;

        }

        char charValue = 'A';

        switch(charValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was B");
                break;
            case 'D':
                System.out.println("Value was B");
                break;
            default:
                System.out.println("Could not find A,B,C,D, or E");
                break;

        };

        String month = "January";
        switch (month.toUpperCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

=======
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(63,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));
    }
    private static String getDurationString(long minutes, long seconds) {
        if((minutes< 0) || (seconds<0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minuteString = hours + "h";
        if(remainingMinutes < 10) {
            minuteString = "0" + minuteString;
        }
        String secondsString = seconds + "h";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minuteString + "m " + secondsString + "s";
    }
    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, seconds);
>>>>>>> 050918491e1dab8ef914dd475806956c3fde8da6
>>>>>>> 335ad01d81f5a744b6d4308a23f507cd5b2ce367
>>>>>>> 4f120d0d0817fc82318b722096302ff098046f10
    }
}
>>>>>>> 19e9958cfcfdb6c1eb92bac2273578d778037a65
>>>>>>> e082b65c4a0b5186710aaf810fcc38dcb64cdaff
>>>>>>> 92237164ad59d75438ce5e2d51379d249070838e
>>>>>>> 70964d116034eae30ff77943349d973bc3d874d0
>>>>>>> 4da91b31094f2998c841b08f038a0ccb6d443113
>>>>>>> 9fb6a0940a2a1f1a99165fe2e4bae2c45afeb6ab
>>>>>>> 8e7f22444f7593efe60b40b30936638659f7f31a
>>>>>>> 4090f8fc2ce911f275d078ddd53a75e1f3667ad9
>>>>>>> f638018a3f94d93ac07eba48aeca7e5e6a7c8b7f
>>>>>>> 999419fa2cb8450bbadedbaad91efdda286b4d76
>>>>>>> b12daa1a24950adb009587a54d481cc51e628fc1
>>>>>>> 3f1d8c014fd2ad75da40af6369251915ae42e380
>>>>>>> cbf29b0cccfe4d1ced6f9b4500fbcf5707ec40cb
>>>>>>> a1eaf105e28252ca7e333ca6197164939cb57f37
>>>>>>> 1a695c9238b0a0f9f6b08b23c11faf500a27caf7
>>>>>>> be91a48f3b1f227104592450d115f20b582398aa
>>>>>>> cf65a9d0661a0c9d40de0388355cc373c88b4846
>>>>>>> fd853c07fa9b3e82973b3b504f463fbdd878c1ee
>>>>>>> baa225ea470c2f8af8b45d56ac8512a708c90b72
>>>>>>> 5af2aedd2a6729cfbaea7d1ef67641de27ce4caf
>>>>>>> 31d95c1030c95f74dc0ec7a02271dccca86ebbaf
>>>>>>> 70c704a0b66936a295b3cebe6577a716372d1983
>>>>>>> 926a7ab4f9e90c5eda170761301025020f6c0a40
>>>>>>> 400e446dd0d330095806e0e7eb71b4a89950dd6c
>>>>>>> 81b94affca24dc056e18d916c16a28ab249d0672
>>>>>>> 587eb191e9b599181ca5455e7abd85f337f90ecf
>>>>>>> 29cdb74cc1866fc209e15541b5d921e95300eab4
>>>>>>> 10de47f01c5c1929a2a1a867de2f972925bda3b7
>>>>>>> 77eef9825aecd69e91c73a9927b0d7f82405ee91
>>>>>>> e3847987595f08bca2b732cb6b4a9c7419141e9b
>>>>>>> 3653a9c57b120858a24482dc611b263f85ff18d3
>>>>>>> 264b5414781ee9cdd49af5a22601d7016f78d06f
>>>>>>> ae01fbb39b617e4545faccbffef9191b2377d066
>>>>>>> a98d9e3d0b68b1aa64fdcb4002df7e7b5b2c81e1
>>>>>>> b74315b9ac8f8cbde99737d23528d4598802ce8c
>>>>>>> ce8851b55d202ded2811adc956a92bb7237745a7
>>>>>>> 0aa23adcb52f49557ed03254033c794c32b5bef5
>>>>>>> 5158b80179052d6c5a3b7fbf0dad6475b478d1b4
>>>>>>> 467f255082dc6ef098c09ae0678003e6ee1639fa
