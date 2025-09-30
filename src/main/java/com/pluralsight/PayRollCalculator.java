package com.pluralsight;
import java.util.Scanner;

public class PayRollCalculator {
    public static void main(String[] args) {

        //main code goes here
        //scanner setup
        Scanner scanner = new Scanner(System.in);

        //user prompts: first name, hours wrkd, pay rate
        //ask for first and last name, get input from user
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();

        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();

        //ask for pay rate and hours, get input from user
        System.out.println("How many hours did you work?");
        double hours = scanner.nextInt();

        System.out.println("What is your pay rate");
        double payRate = scanner.nextInt();

        // defining gross pay
        double grossPay = payCalculator(hours, payRate);

      //  System.out.println(grossPay);
        resultsMessage(firstName, lastName, hours, payRate, grossPay);

    }
    //methods go here
    public static double payCalculator(double hours, double payRate) {
        double grossPay = hours * payRate;
        return grossPay;

    }

    public static void resultsMessage( String firstName, String lastName, double hours, double payRate, double grossPay) {
        System.out.printf("Hello %s %s. You have worked a total of %.2f hours, your pay rate is %.2f. Your gross pay is %.2f", firstName, lastName, hours,payRate, grossPay );
    }
}

/*
steps:
1. create a method that calculates gross pay: Multiply hours by pay rate DONE
2. create method that prints hello, name. You have worked a total of x hours. Your pay rate is x. Your gross pay is x
3. prompt user for name, hours worked, and pay rate
4. import scanner, set up scanner, create variable with value scanner

 */