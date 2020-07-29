package com.company;

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

    }

}
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

public class Main {

    public static void main(String[] args) {
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
