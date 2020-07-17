package com.company;

public class Main {
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
    }
}
