package com.company;

public class Main {

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

