package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte myByteValue = 25;
        short myShortValue = 34;
        int myIntValue = 45;

        long longTotal = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 *
                (myByteValue + myByteValue + myIntValue));
    }
}
