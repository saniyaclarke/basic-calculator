package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        String inputText;
        inputText= input.nextLine(); //"2"
        int num1 = Integer.parseInt(inputText);

        System.out.println("Enter number 2: ");
        inputText = input.nextLine();  // "4"
        int num2 = Integer.parseInt(inputText);

        System.out.println("Enter operation, you would like to use: ");
        String operation = input.nextLine();
        System.out.println("You chose Multiplication: ");

        System.out.println(num1 * num2);


//        if (operationselection.equals(operation0))
//        System.out.println("You chose Addition: ");
//        System.out.println(num1 + num2);
//
//        else if (operationselection.equals(operation1))
//        System.out.println("You chose Subtraction: ");
//        System.out.println(num1 - num2);
//
//        else if (operationselection.equals(operation2))
//        System.out.println("You chose Multiplication: ");
//        System.out.println(num1 * num2);
//
//        else if (operationselection.equals(operation3))
//        System.out.println("You chose Division: ");
//        System.out.println(num1 / num2);


    }
}
