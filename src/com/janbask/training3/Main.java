package com.janbask.training3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //printMonthName(2);
        //switchCheck(23);
        //writeMultiplicationTable(2,10);
        //writeMultiplication(2,20);
        //dowhileexample(2,10);
        dowhileexample(2,0);
    }

    static void writeMultiplicationTable(int number, int maxfactor){
        for (int i = 1; i<=maxfactor; i++){
            System.out.println(number*i);
        }

    }

    static void writeMultiplication(int number, int maxFactor){
        int counter = 1;
        while(counter<=maxFactor){
            System.out.println(number*counter++);
        }
    }

    static void writeRange(int number, int maxRange){
        while(number<=maxRange)
            System.out.println(number++);
    }

    static void switchCheck(int number){
        switch (number%2){
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
                break;
        }
    }

    static void printMonthName(int month){
        switch (month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
        }
    }

    static void dowhileexample(int number, int maxFactor){
        int counter=1;
        do {
            System.out.println(number*counter);
        }while (++counter<=maxFactor);
    }

    static void simplecheck(){
        int number = 9;
        if(number%2==0 && number%3==0){
//            if(number%3==0)
//                System.out.println("Even and divisible by 3");
//            else
            System.out.println("Meets our requirement");
        }
        else
            System.out.println("Does not meet our requirement");
    }
}
