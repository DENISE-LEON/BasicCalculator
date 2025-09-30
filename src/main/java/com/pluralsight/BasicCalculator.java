package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //asking user for their numbers
        System.out.println("Please provide first number");
        int firstNum = scanner.nextInt();

        System.out.println("Please provide second number");
        int secondNum = scanner.nextInt();

        System.out.printf("Your numbers are %d and %d\n", firstNum, secondNum);
        //eating line
        scanner.nextLine();
        // operation?
        System.out.println("What operation would you like to perform with these numbers?");
        System.out.println("Enter 'add', 'subtract', 'multiply' or 'divide'");
        String operation = scanner.nextLine();

        //operation time
        int result = 0;
        if (operation.equalsIgnoreCase("add")) {
            result = firstNum + secondNum;
            //System.out.printf("The result of %sing %d and %d is %d", operation, firstNum, secondNum, result);
        } else if (operation.equalsIgnoreCase("subtract")) {
            result = firstNum - secondNum;

        } else if (operation.equalsIgnoreCase("multiply")) {
            result = firstNum * secondNum;
        } else if (operation.equalsIgnoreCase("divide")) {
            result = firstNum / secondNum;
        } else {
            System.out.println("Please provide a valid  operation");
            System.exit(0);
        }
            System.out.printf("The result of %sing %d and %d is %d", operation, firstNum, secondNum, result);
    }
}
