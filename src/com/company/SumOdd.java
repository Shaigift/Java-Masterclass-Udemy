package com.company;

public class SumOdd {

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start > 0 && end > 0 && start <= end){
            for(int i = start; i <= end; i++){
                if(isOdd(i)) {
                    System.out.println("This number is " + i);
                    sum += i;
                }
            }
            return sum;
        }

        return -1;
    }


    public static boolean isOdd(int num) {
        if(num > 0 && num % 2 != 0){
            return true;
        }
        return false;
    }
}