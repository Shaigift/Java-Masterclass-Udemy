package com.company;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 4da91b31094f2998c841b08f038a0ccb6d443113
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

<<<<<<< HEAD
        int counter = 0;
        int sum = 0;

        while(counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAntInt = scanner.hasNextInt();

            if (isAntInt) {
                int number = scanner.nextInt();
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
